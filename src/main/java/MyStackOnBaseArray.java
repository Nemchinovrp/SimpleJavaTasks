import java.util.Arrays;

class MyStackOnBaseArray<T> {

    private T[] array;
    private int size = 0;

    public MyStackOnBaseArray(int sizeStack) {
        if (sizeStack <= 0) {
            sizeStack = 1;
        }
        array = (T[]) new Object[sizeStack];
    }

    public void push(T value) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 3 / 2);
        }
        array[size++] = value;
    }

    public T pop() {
        return size > 0 ? array[--size] : null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int depth() {
        return size;
    }

}

class Main {
    public static void main(String[] args) {
        MyStackOnBaseArray<String> stack = new MyStackOnBaseArray<String>(4);
        stack.push("Один");
        stack.push("Два");
        stack.push("Три");
        stack.push("Четыре");
        System.out.println("Пуст ли стек? - " + stack.isEmpty());
        System.out.println("Количество элементов в стеке: " + stack.depth());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}