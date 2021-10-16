import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("sum is ");
        sum(a, b);
        s.close();
    }
    public static void sum(int a ,int b) {
        System.out.println(a+b);
    }
    
}
