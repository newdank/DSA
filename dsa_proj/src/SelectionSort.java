import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selectsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void selectsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxElement = getMaxInded(arr,0, last);
            swap(arr,maxElement,last);
        }
    }

    public static int getMaxInded(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <=  end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

}
