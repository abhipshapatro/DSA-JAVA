import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long matches,runs,innings,notOut;
        double avg;
        System.out.println("Enter no of matches played :");
         matches = s.nextInt();
        while (true) {
            System.out.println("Enter no of innings :");
             innings = s.nextInt();
            if (innings <= matches)
                break;
            // System.out.println(" ");
        }
        while (true) {
            System.out.println("no of times not out:");
            notOut = s.nextInt();
            if (notOut <= innings) {
                break;
            }
            // System.out.println(" ");
        }
        System.out.println("enetr runs scored: ");
         runs = s.nextInt();
        if (innings == notOut) {
            avg = runs;
        } else {
            avg = runs / (innings - notOut);
        }
        System.out.println("Batting average : " + avg);
        s.close();

    }
}
