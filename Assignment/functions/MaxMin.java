import java.util.Scanner;

/**
 * MaxMin
 */
public class MaxMin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = s.nextInt();
        System.out.println("enter second number:");
        int b = s.nextInt();
        System.out.println("enter third number:");
        int c = s.nextInt();
        Max(a, b, c);
        Min(a, b, c);
        s.close();
    
    }
    public static void Max(int a, int b , int c) {
        System.out.println("Maximum among three numbers : ");
        if (a>b && a>c) {
            System.out.println(a);
        }
        else if(b>c && b>a){
            System.out.println(b);
        }
        else
        System.out.println(c);
    }
    public static void Min(int a, int b , int c) {
        System.out.println("Minimum among three numbers : ");
        if (a<b && a<c) {
            System.out.println(a);
        }
        else if(b<c && b<a){
            System.out.println(b);
        }
        else
        System.out.println(c);
    }
  
}