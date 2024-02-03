import java.util.Scanner;

public class BreakCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operation : ");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                System.out.println("Enter 2 numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(ch == '+'){
                    ans = num1+num2;
                }
                if(ch == '-'){
                    ans=num1-num2;
                }
                if(ch== '/'){
                    ans = num1/num2;
                }
                if(ch == '*'){
                    ans = num1*num2;
                }
                System.out.println(ans);
            }
            else if(ch =='x' || ch =='X'){
                break;
            }
            else{
                System.out.println("Invalid operation!");
            }



        }
    }
}
