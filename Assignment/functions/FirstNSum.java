import java.util.Scanner;

/**
 * FirstNSum
 */
public class FirstNSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Sum of first "+n+" natural nos is "+sum(n));
        s.close();
    }
    public static int sum(int n) {
        int add=0;
        for (int i = 1; i <= n; i++) {
            add += i;
        }
        return add;
    }
}