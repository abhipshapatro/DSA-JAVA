import java.util.Scanner;

public class mirror {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();
        int i=1;
        
        while(i<=n){
            int k=2*n-i+1;

            while (k >= i) {
                System.out.print(" ");
                k--;
            } //spaces
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();

            i++;
        }
        s.close();
    }
    
}
