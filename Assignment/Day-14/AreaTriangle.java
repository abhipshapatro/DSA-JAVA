import java.util.Scanner;

public class AreaTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter height : ");
        int h = s.nextInt();
        System.out.println("enter base : ");

        int b = s.nextInt();

        double area = 0.5 * b * h;
        System.out.println("Area of triangle is " + area);

        s.close();
    }

}
