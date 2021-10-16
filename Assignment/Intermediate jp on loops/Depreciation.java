import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {

        long amount, deppercent, year, afterdep, temp;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter amount :");
        amount = s.nextLong();
        System.out.println("Enter Depreciation percentage :");
        deppercent = s.nextLong();
        System.out.println("Enter  number of years :");
        year = s.nextLong();

        temp = amount;
        for (int i = 0; i < year; i++)
            temp = ((100 - deppercent) * temp) / 100;
            afterdep = temp;
        System.out.println("After depreciation : " + afterdep);
        s.close();
    }

}
