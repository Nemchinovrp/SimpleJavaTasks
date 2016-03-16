

public class MethodsWithArguments {
    public static void main(String[] args) {
        sum(3,20);
    }

    public static void sum(int x, int y) {
        int z = 4;
        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 9;
        }
        if (z <= y) {
            y++;
        }
        System.out.println(z + " " + y);
    }
}
