import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (checkTriplet(a, b, c)) {
            System.out.println(a +","+b+","+c+ " is a Pythagorean triplet");
        } else {
            System.out.println(a +","+b+","+c+ " is not a Pythagorean triplet");
            
        }
        s.close();

    }
    public static boolean checkTriplet(int a, int b,int c) {
        
        if((a*a == (b*b + c*c)) ||(b*b == (a*a + c*c)) || (c*c == (a*a +b*b)) ){
            return true;
        }
        else{
            return false;
        }
    }
}
