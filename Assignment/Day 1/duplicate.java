package array1;

import java.util.Scanner;

public class duplicate {

    public static int dup(int[] a){

        int num=0,c=0;
        for(int i =0;i<= a.length-2;i++){
        num = a[i];
        for(int j =0 ; j<=a.length-2 ; j++){
            if(num == a[j])
            c++;
        }
        if(c>1)
        break;
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int a[]= new int[n];

        for(int i=0;i<n-2;i++)
        a[i] = s.nextInt();

        r = dup(a); 



        
    }
    
}
