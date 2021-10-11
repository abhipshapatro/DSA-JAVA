import java.util.Scanner;

public class LargestTillInputZero {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int lar = 0;
        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }

            if (n > lar) {
                lar = n;
            }
        }
        System.out.println("largest among all is " + lar);
        s.close();

    }

}
