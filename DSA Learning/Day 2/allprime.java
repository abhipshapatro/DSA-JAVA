import java.util.Scanner;

public class allprime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=2 ; i<=n ; i++){
            int c=0;

            for (int j = 1; j <= i; j++) {
                while(i%j==0)
                c=c+1;
            }
                if(c==2)
                System.out.println(i);
        }
         
            s.close();
        
    }
    
}
