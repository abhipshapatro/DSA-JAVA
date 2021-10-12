import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int r, sum = 0, m = n;
        while (n > 0) {
            r = n % 10;
            sum += r * r * r;
            n /= 10;
        }
        if (sum == m) {
            System.out.println(m + " is armstrong");
        } else {
            System.out.println(m + " is not armstrong");

        }

        s.close();
        ;
    }

}
