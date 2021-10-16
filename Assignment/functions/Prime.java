import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (checkPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
        s.close();

    }

    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

}
