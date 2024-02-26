import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
//        int[] arr1 = sort(arr);
        int arrlo = sortfnd(arr);
        System.out.println(arrlo);
//        System.out.println(Arrays.toString(arr1));


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

    public static int sortfnd(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct  = arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }

        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    public static void swap (int[] arr, int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
