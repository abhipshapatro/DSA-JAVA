import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int yr = s.nextInt();

        if (yr % 400 == 0 || (yr % 4 == 0 && yr % 100 != 0)) {
            System.out.println("leap yr");
        } else {
            System.out.println(" not a leap yr");

        }
        s.close();
    }

}
