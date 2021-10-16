import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of subjects");

        int n = s.nextInt();

        double[] marks = new double[n];

        System.out.println("Enter marks");

        for (int i = 0; i < n; i++) {
            marks[i] = s.nextInt();
        }

        double grade[] = new double[n];

        double cgpa, sum = 0;

        for (int i = 0; i < n; i++) {
            grade[i] = (marks[i] / 10);
        }

        for (int i = 0; i < n; i++) {
            sum += grade[i];
        }

        cgpa = sum / n;

        System.out.println("cgpa=" + cgpa);

        System.out.println("percantage from cgpa=" + cgpa * 9.5);

        s.close();
    }

}
