public class ArmstrongNumber {

    public static boolean armstrog(int i) {

        int temp1, temp2, degree = 0, sum = 0, rest;
        temp1 = i;
        while (temp1 > 0) {
            degree++;
            temp1 = temp1 / 10;
        }
        temp2 = i;
        while (temp2 > 0) {
            rest = temp2 % 10;
            sum = sum + power(rest, degree);
            temp2 = temp2 / 10;
        }
        return sum == i;
    }

    static int power(int n, int r) {
        int c, p = 1;

        for (c = 1; c <= r; c++)
            p = p * n;

        return p;
    }
}
