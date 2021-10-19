import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks:");
         int marks = s.nextInt();
        displayGrades(marks);
        
        s.close();
    }
    public static void displayGrades(int marks) {
        
        if (marks>=91 && marks<=100) {
            System.out.println("AA");
        }
        if (marks>=81 && marks<=90) {
            System.out.println("AB");
        }
        if (marks>=71 && marks<=80) {
            System.out.println("BB");
        }
        if (marks>=61 && marks<=70) {
            System.out.println("BC");
        }
        if (marks>=51 && marks<=60) {
            System.out.println("CC");
        }
        if (marks>=41 && marks<=50) {
            System.out.println("DD");
        }
        if (marks<=40) {
            System.out.println("Fail");
        }
    }
    
}
