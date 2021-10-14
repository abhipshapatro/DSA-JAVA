import java.util.Scanner;

public class AllSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int se = 0, sn = 0, so = 0;
        while (true) {

            int n = s.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                sn += n;
            } else {

                if (n % 2 == 0) {
                    se += n;
                } else {
                    so += n;
                }
            }
        }
        System.out.println("Sum of negative nos. = " + sn);
        System.out.println("Sum of positive even nos. = " + se);
        System.out.println("Sum of positive odd nos. = " + so);

        s.close();
    }

}
