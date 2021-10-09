import java.util.Scanner;

public class Equilateral {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double area = Math.sqrt(3)/4 * a*a;
        System.out.println("area of equilateral triangle is "+ area);
        s.close();
    }
    
}
