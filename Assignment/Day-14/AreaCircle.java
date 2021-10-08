import java.util.Scanner;

/**
 * AreaCircle
 */
public class AreaCircle {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius : ");
        int radius = s.nextInt();

        double area = 3.14*radius*radius;
        System.out.println("Area of the circle is "+ area);

        s.close();
    }
}