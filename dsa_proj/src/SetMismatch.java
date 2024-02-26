import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {3,7,1,4,2,7,5};
        int[] arr1 = sort(arr);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct  = arr[i]-1;
            if(arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }

        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                return new int[] {arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swap (int[] arr, int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
