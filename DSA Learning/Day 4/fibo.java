public class fibo {
    public static int fib(int n){
        if(n==0||n==1)
        return n;
        else
            return fib(n-1)+ fib(n-2);
        
    }

    

    public static void main(String[] args) {
        
        int n = 8;
        int a = fib(n);
       System.out.println(a);
    }
    
}
