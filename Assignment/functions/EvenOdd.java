import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = s.nextInt();
        EO(n);
        s.close();
    }
    public static void EO(int n) {
        if (n%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    
}
