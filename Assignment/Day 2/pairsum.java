package array1;

import java.util.Scanner;



public class pairsum {

    public static void print(int[] a , int x){

        int num=0,c=0,sum=0;
        for(int i = 0; i<a.length ; i++){
            num = a[i];
            for(int j =0;i<a.length;j++){
                sum = num + a[j];
                if(sum == x)
                {c++;break;}
                
            }
            
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();

        int a[] = new int[n];

        for(int i = 0 ; i<n ; i++)
        a[i]=s.nextInt();

        print(a, x);
        s.close();

    }
    
}
