import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        int ans = sort(arr);
        System.out.println(ans);
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
return arr.length;
        }

   public static void swap (int[] arr, int first,int second) {
       int temp = arr[first];
       arr[first] = arr[second];
       arr[second] = temp;
   }
}