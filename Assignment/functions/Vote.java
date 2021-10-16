import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        Eligible(age);
        s.close();
    }

    public static void Eligible(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");

        }
    }

}
