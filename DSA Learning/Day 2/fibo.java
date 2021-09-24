import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a =0,b=1,c=0;
        if(n==0){
        System.out.println(a);
        
        }
        else{

        for(int i=2;i<=n;i++){

            c=a+b;
            a=b;
            b=c;
                
            }
            System.out.println(b);
        }
        s.close();

    }
    
}
