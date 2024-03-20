import java.util.Arrays;

public class NUniqueIntegersToSumOfZero {
    public static void main(String[] args) {
        int[] arr = sumzero(5);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sumzero(int n){
        int[] arr = new int[n];
        int start = n/2;
        int end = -n/2;
        for (int i = 0; i < arr.length/2; i++) {
            if(n%2==0){
                arr[2 * i]= start;
                arr[2 * i + 1]=end;
                start++;
                end--;
            }
            else if(n==1){
                return new int[] {0};
            }
            else{
                arr[2 * i]= start;
                arr[2 * i + 1]=end;
                start++;
                end--;
                arr[arr.length-1]=0;
            }
        }
        return arr;
    }

}
