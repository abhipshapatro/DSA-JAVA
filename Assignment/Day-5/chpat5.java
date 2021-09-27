import java.util.Scanner;

public class chpat5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i,j,k;
        int c = 64 ;
        k=n;
        i=k;
        while (i>=1) {
             j=i;
            
           while (j<=n) {
                System.out.print( (char) (c+j) );
                
                j++;
               
            }
          
            System.out.println();
            i--;
        }
        s.close();
    }
    
}
