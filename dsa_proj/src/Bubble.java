import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
//        int[] arr = {6,7,5,4,2,1,3};
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        boolean checker;
        for (int i = 0; i < arr.length; i++) {
            checker=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    checker=true;
                }

            }
            if(!checker){
                break;
            }
        }
    }
}
