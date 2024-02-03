import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value, we check the repetation of 3 in the number");
        int count=0;
        int n = sc.nextInt();
        while(n>0){
            int rem=n%10;
            if(rem==3){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
