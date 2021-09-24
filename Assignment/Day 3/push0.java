

import java.util.Scanner;

public class push0 {

    public static void push( int[] a , int n){


        int c=0;
        for(int i =0;i<n ; i++){
            if(a[i]!=0)
            a[c++] = a[i];

        }

        for(int j =c ; j< n ;j++){
            a[j]=0;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a[] = new int[n];

        for(int i =0;i<n;i++)
        a[i]=s.nextInt();
        push(a, n);
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        s.close();
        
    }
    
}
