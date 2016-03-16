

public class FibonachiNumbers {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int first = 0;
        int second = 1;
        int next = 0;
        while(next < 100){
            next = first + second;
            first = second;
            second = next;
            System.out.println(next);
        }
    }
}
