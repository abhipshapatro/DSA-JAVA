import java.util.Scanner;


public class breakcont {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean divided = false;
        for(int d =2;d<n;d++){
            if(n%d==0){
                divided =true;
                break;
            }
        }
            if(divided)
            System.out.println("not prime");
        else
        System.out.println("prime");
        s.close();

        }
        

      /*  int d=2;
        boolean divided = false;
        while (d<n) {
            if(n%d==0){

            divided = true;
            break;
            }
            d=d+1;
        }
        if(divided)
            System.out.println("not prime");
        else
        System.out.println("prime");
        */    
        
    
    }

