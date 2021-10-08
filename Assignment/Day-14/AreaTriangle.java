import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        double sp = (a + b + c) / 2;
        double area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
        System.out.println("Area of triangle is " + area);

        s.close();
    }

}
