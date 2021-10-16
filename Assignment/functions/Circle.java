import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = s.nextInt();
        circumference(r);
        area(r);
        s.close();
    }
    public static void circumference(int r) {
        System.out.print("circumference is ");
        System.out.println(2*3.14*r);
    }
    public static void area(int r) {
        System.out.print("area is ");
        System.out.println(3.14*r*r);
    }
    
}
