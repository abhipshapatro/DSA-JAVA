import java.util.Scanner;

public class rotate {

    public static void rotarray(int[] a, int n, int d){

        for(int i = 0;i<d;i++)
        a[i]=a[d++];

        int c=0;
        for(int i = n-d ; i<n;i++)
        a[i] = a[c++];
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();

        int d = s.nextInt();
        rotarray(a, n, d);
        for(int i=0;i<n ;i++)
        System.out.print(a[i]+" ");
        s.close();

    }
    
}
