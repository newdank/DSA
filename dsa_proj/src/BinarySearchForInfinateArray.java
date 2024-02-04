import java.util.Arrays;

public class BinarySearchForInfinateArray {
    public static void main(String[] args) {
int[] arr= {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180,180};
//        System.out.println(Arrays.toString(logicOfStartAndEnd(arr,150)));
    int ans = logicOfStartAndEnd(arr,160);
        System.out.println(ans);
    }


    static int logicOfStartAndEnd(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1) * 2;
            start=temp;
        }
        return findingArrayIndex(arr,target,start,end);
    }
    static int findingArrayIndex(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = start + 1;
            }
            else
                return mid;
        }
        return -1;
    }
}