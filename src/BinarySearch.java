import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-90, -77, -54, - 51, -49, -33, -20, 0, 2,4,6,10,12,14,17,25,46,67,78,98,543,678,765,6554,13457};
        int[] arr = {100, 90, 88, 77, 66,50, 44, 33,20,11,9,5,3,1,-9,-89,-100};
        int ans = binarySearch(arr,90);

        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int count=0;

        while(start<=end){
            count++;
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start=mid + 1;
            }
            else
                return mid;

            System.out.println("Count : "+count);
        }

        return -1;
    }
}
