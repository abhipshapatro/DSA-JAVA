import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Prime nos between "+a +"and "+b+" :");
        prime(a, b);
        s.close();

    }
    public static void prime(int a , int b) {
        
        for (int i = a; i <= b; i++) {
            int n = i,c =0;
            for (int j = 1; j <=n ; j++) {
                if(n%j ==0)
                c=c+1;
            }
            if(c==2)
            System.out.println(n);
        }
    }
    
}
