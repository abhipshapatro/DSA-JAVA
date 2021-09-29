import java.util.Scanner;

public class onetoN {

    public static void printTillN(int n){

        if(n<=0)
        return;
        
        for(int i =1;i<=n ;i++)
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        printTillN(n);
        s.close();
             
    }
    
}
