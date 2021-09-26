package array1;

import java.util.Scanner;

public class intersect {

    public static void el(int a1[], int a2[]){

        int num=0;
        for(int i=0;i<a1.length;i++){
            num = a1[i];
            for(int j=0;j<n;j++){
                if(num == a2[j]){
                System.out.print(num+" ");
                break;}
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int a1[] = new int[m];
        for(int i =0;i<m;i++)
        a1[i]= s.nextInt();

        int a2[] = new int[n];
        for(int i =0;i<n;i++)
        a2[i]=s.nextInt();

        el(a1, a2);
        s.close();


    }
    
}
