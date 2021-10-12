import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("factorial of "+n+" is ");
        if (n==0) {
            System.out.println( n+1 );
        } else {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println(f);
        }
       
        s.close();
    }
}
