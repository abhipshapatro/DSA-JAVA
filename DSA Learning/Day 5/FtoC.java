import java.util.Scanner;

public class FtoC {

    public static void ftoc(int S,int E,int W ){
   
        int c=0;
        int i=S;
       while(i<=E){

            c = (i-32)* 5/9;
            System.out.println(i+"\t"+c);
            i=i+W;
        }
            
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int S = s.nextInt();
        // int W = s.nextInt();
        // int E= s.nextInt();
       
        int S = 0;
        int E = 100;
        int W = 20;
        ftoc(S, E, W);
        s.close();
        
    }
    
}
