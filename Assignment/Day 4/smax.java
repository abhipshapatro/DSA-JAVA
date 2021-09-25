

import java.util.Scanner;

public class smax {

    public static void second(int[] a,int n){

        int max = Integer.MIN_VALUE;
        int slar = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++){
            max = Math.max(max, a[i]);
        }
        for(int i =0;i<n;i++){
            if(a[i] != max)
            slar = Math.max(slar, a[i]);
        }
        if(slar != Integer.MIN_VALUE)
        System.out.println(slar);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++)
        a[i] = s.nextInt();
        second(a, n);
        s.close();
    }
    
}
