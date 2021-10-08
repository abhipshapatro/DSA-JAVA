import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = s.nextInt();
        System.out.println("Enter breadth : ");
        int b = s.nextInt();

        double area = l*b;
        System.out.println("Area of triangle is "+area);

        s.close();
    }
    
}
