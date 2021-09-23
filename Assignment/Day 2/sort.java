import java.util.Scanner;

public class sort {

    public static int[] sort01(int arr[] , int n){

        for(int i =0 ; i< n;i++){
            if(arr[i] == 0)
            c++;
        }

        for(int i = 0 ; i<c ;i++){
            arr[i] = 0;
        }

        for(int j = c; j < n ; j++){
            arr[j] = 1;
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i =0 ; i<n ; i++){
            arr[i]= s.nextInt();
        }
        
        sort01(arr, n);
        for(int i =0;i<n ;i++){
            System.out.println(arr[i]);
        }

        s.close();
        }
    
}
