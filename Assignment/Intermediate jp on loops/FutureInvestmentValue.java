import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principal:");
        int p = s.nextInt();
        System.out.println("Enter rate of interest:");
        int i = s.nextInt();
        System.out.println("Enter time period:");
        int n= s.nextInt();

        double fv = p * Math.pow( (1+i/100), n);
        System.out.println("Future investment value is "+fv);
        s.close();
    }
    
}
