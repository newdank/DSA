import java.util.Arrays;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(checker(arr)));

    }
    public static int[] checker(int[] arr){
        int[] newarr = new int[arr.length];
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            value = arr[i];
            newarr[i] = arr[value];
        }
        return newarr;
    }
}
