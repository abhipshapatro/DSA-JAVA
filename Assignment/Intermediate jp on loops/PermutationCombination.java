import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int f= 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        int f1= 1;
        for (int i = 1; i <= n-r; i++) {
            f1 *= i;
        }
        int f2= 1;
        for (int i = 1; i <= r; i++) {
            f2 *= i;
        }

        int npr = f/f1;
        int ncr = f/(f1*f2);

        System.out.println("permutation is "+npr);
        System.out.println("combination is "+ncr);

        s.close();
    }
    
}
