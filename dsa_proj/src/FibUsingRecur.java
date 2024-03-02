public class FibUsingRecur {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibo sequence : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
//        System.out.println(fibo(3));
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
