import java.util.Scanner;

public class LinearSearchForString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String aString = sc.next();
        System.out.println("Enter the target string");
        char a = sc.next().charAt(0);
        boolean ans = stringSearch(aString,a);
        System.out.println(ans);
    }
    public static boolean stringSearch(String arr,char a){
        for (int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) == a)
                return true;
        }
        return false;
    }
}
