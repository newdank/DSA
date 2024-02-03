public class RevNum {
    public static void main(String[] args) {
        int n=1234;
        int temp=0;
        while(n>0){
            int rem = n%10;
            temp = temp*10 + rem;
            n/=10;

        }
        System.out.println(temp);
    }
}

