import java.util.Scanner;

/**
 * HCfLcm
 */
public class HCfLcm {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();

        int n1 = a;
        int n2 = b;
        int temp, hcf, lcm;
        while (n2 != 0) {
            temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        hcf = n1;
        lcm = (a * b) / hcf;

        System.out.println("HCF of the numbers is " + hcf);
        System.out.println("LCM of the numbers is " + lcm);

        s.close();
    }
}