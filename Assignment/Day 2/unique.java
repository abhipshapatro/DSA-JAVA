package array1;

import java.util.Scanner;

public class unique {
    public static int unique(int arr)
    {
        int num = 0,c=0;
        for(int i =0;i<n ; i++){

            num = arr[i];

            for(int j=0; j<n ;j++){

                if(num == arr[j]){
                    c++;
                }
                if(c==1)
                return num;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];
        int r = unique(arr);
        System.out.println("unique number = "+ r);

        s.close();

    }
}
