import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int  n = s.nextInt();
        System.out.println("Factorial of "+n+" is "+ Factorial(n));
        s.close();
    }

    public static int Factorial(int n) {
       if (n==0||n==1) {
           return 1;
       }
       return Factorial(n-1)*n;
    }
}
