import java.util.Scanner;

/**
 * AreaIsosceles
 */
public class AreaIsosceles {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter inputs: ");
        int h = s.nextInt();
        int b = s.nextInt();
       
        double area = 0.5 * b * h;
        System.out.println("area = "+area);
        s.close();
    }
}