import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int h = s.nextInt();
        System.out.println("Area of parallelogram is "+ b*h);
        s.close();
    }
    
}
