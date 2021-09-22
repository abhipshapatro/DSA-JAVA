import java.util.Scanner;

public class trpat6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i=1;
        while (i<=n) {
            int k=1;
            while(k<=i-1){
                System.out.print(" ");
                k++;
            }
            int j=1;
            while (j<=n-i+1) {
                System.out.print("*");
                j++;
                
            }
            i++;
            System.out.println();
            
        }
        s.close();
   }
    
}
