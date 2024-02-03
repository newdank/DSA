import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int i = 1;
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int temp = i;
            i=i+p;
            p=temp;
            count++;
        }
        System.out.println(i);
        System.out.println("===========================");
        System.out.print(" "+a);
        System.out.print(" "+b);
        for(int j=2;j<=n;j++){
            int temp = b;
            b=b+a;
            a=temp;
            System.out.print(" "+b);
        }
    }
}
