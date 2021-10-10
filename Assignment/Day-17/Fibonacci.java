import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        System.out.println("fibonacci series : ");
        int a = 0,b=1,count=0;
        while (count < n) {

            System.out.println(a + " ");

            int c = a+b;
            a=b;
            b=c;
            count++;
            
        }

        s.close();
    }
    
}