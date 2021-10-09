import java.util.Scanner;

/**
 * AreaRhombus
 */
public class AreaRhombus {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter diagonals: ");
        int d1 = s.nextInt();
        int d2 = s.nextInt();

        System.out.println("Area of rhombus :"+ 0.5*d1*d2);

        s.close();
    }
}