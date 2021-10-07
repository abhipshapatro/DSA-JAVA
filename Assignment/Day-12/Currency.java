import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter currency in Rupees : ");
        double inr = s.nextDouble();

        double usd = inr / 73;
        System.out.println("Currency in USD : "+ usd);
        
    }
    
}
