import java.util.Scanner;

public class pallin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (checkPallin(n)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
        s.close();
    }
    public static boolean checkPallin(int n ) {
        
        int p =0;int m =n;
        while (n!=0) {
            p = p*10 + n%10;
            n /= 10;
        }
        if (p==m) {
            return true;
        } else {
            return false;
        }
    }
    
}
