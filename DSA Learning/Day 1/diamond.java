import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int n = s.nextInt();

        int i=1;
        while (i<=n) {
            int spaces=1;
            while (spaces<=n-i) {
                System.out.print(" ");
                spaces++;
                
            }
            int w=1;
            while (w<=2*i-1) {
                System.outprint("*");
                w++;
            }
        
        System.out.println();
        i++;
        }
            // dec order
            int j=n-1;
            while(j>=1){
                //spaces
                int p=n-1;
                while(p>=j){
                    System.out.print(" ");
                    p--;
                }
                int k=1;
                while (k<=2*j-1) {
                    System.out.print("*");
                    k++;
                }
                
                j--;
                System.out.println();
            }          
                  
        s.close();
    }
}   
    
    

