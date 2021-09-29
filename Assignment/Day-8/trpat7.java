import java.util.Scanner;

public class trpat7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int val=n; 
        int i=1;
        while (i<=n) {
            int j=1;
            
            while (j<=n-i+1) {
                System.out.print(val);
                j++;
                
            }
            val--;
            System.out.println();
            i++;
            
        }
        s.close();
    }
    
}
