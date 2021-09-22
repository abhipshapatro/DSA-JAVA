import java.util.Scanner;

public class trpat10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i=1,val;
        while (i<=n) {
           
            //spaces
            int k=2*n-i-1;
            while(k>=i){
                System.out.print(" ");
                k--;
            }
            
            
            //inc triangle   
           int  j=1; val=i;
            while (j<=i) {
                System.out.print(val);
                val++;
                j++;
                
            }


            int x=i-1,p=i;
            j=1;
            while (j<=i-1) {
                
                    
                System.out.print(p);
                x--;
                p++;
                j++;
            }
            
        

            i++;
            System.out.println();
        }
        s.close();
    }
    
}
