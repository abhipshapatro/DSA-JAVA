import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string:");
        String str = s.nextLine();

        String newstr="";
       for (int i = 0; i < str.length() ; i++) {
           newstr = str.charAt(i) + newstr;
       }
        System.out.println("Reverse string:");
        System.out.println(newstr);
        s.close();
    }
    
}
