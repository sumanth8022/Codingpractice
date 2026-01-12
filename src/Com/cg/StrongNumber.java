package Com.cg;

public class StrongNumber {

    // factorial method
    static int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 145;
        int temp = n;   // store original number
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum = sum + facto(rem);
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
