import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortUsingRec {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        System.out.println(bubbleSort(arr,0,arr.length-1,arr[0]));
//        System.out.println(Arrays.toString(bubbleSort(arr,0,arr.length-1,arr[0])));
bubble(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[]arr,int c,int r){
        if(r == 0){
            return;
        }
        if(r > c){
            if(arr[c]>arr[c+1]){
                int temp = arr[c+1];
                arr[c+1] = arr[c];
                arr[c] = temp;
            }
            bubble(arr,c+1,r);
        }
        bubble(arr,0,r-1);
    }

}
