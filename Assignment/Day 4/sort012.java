
import java.util.Scanner;

public class sort012 {

    public static int[] sort(int[] a, int n) {

        int c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                c++;
            if (a[i] == 1)
                d++;
        }

        int i;
        for (i = 0; i < c; i++) {
            a[i] = 0;
        }

        for (int j = i; j < (i + d); j++) {
            a[j] = 1;
        }
        for (int k = (i + d); k < n; k++) {
            a[k] = 2;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();

        sort(a, n);

        for (int i = 0; i < n; i++)
            System.out.println(a[i]);
        s.close();
    }

}
