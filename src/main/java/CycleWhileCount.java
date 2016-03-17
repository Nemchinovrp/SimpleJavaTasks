public class CycleWhileCount {
    public static void main(String[] args) {
        int x = 100;
        int count = 0;

        while (x > 0) {
            count++;
            System.out.println(x / 10);
            x = x / 2;
            System.out.println("x=" + x);
        }
        System.out.println(count);
    }
}
