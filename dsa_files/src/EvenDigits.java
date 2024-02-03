public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {10, 11, 109, 6362, 109, 1045, 18945, 273, 9486, 162};
//        System.out.println(isEven(arr));
//        int a = 10;
//        if(Math.log10(a)==1){
//
//        }
        System.out.println(logcheck(arr));
    }

    static int isEven(int[] arr) {
        int sum=0;
        for(int i : arr){
            int count=0;

            while(i>0){
                count++;
                i=i/10;
            }


            if(count%2==0){
                sum++;
            }
//            count=0;
        }
        return sum;
    }
    public static int logcheck(int[] arr){
        int count=0;
        for(int i : arr){
            if((((int)Math.log10(i)+1)%2)==0){
                count++;
            }
        }
        return count;
    }
}
