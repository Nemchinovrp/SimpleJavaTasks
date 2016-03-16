

public class ArmstrongNumberOutput {
    public static void main(String[] args) {
        output(10000000);
    }
    public static void output(int number){
        for(int i=0; i<number; i++){
            if(armstrog(i)){
                System.out.println("This is number Armstrong = " + i);
            }
        }
    }
    public static boolean armstrog(int num) {

        int temp1, temp2, degree = 0, sum = 0, rest;
        temp1 = num;
        while (temp1 > 0) {
            degree++;
            temp1 = temp1 / 10;
        }
        temp2 = num;
        while (temp2 > 0) {
            rest = temp2 % 10;
            sum = sum + power(rest, degree);
            temp2 = temp2 / 10;
        }

        return sum == num;
    }

    static int power(int n, int r) {
        int c, p = 1;

        for (c = 1; c <= r; c++)
            p = p * n;

        return p;
    }
}
