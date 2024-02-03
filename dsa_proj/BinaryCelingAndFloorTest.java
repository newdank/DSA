public class BinaryCelingAndFloorTest {
    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50};
        int[] arr1 = {50,40,30,20,10};
        int ans = binaryCelingFloorCheck(arr1,35);
        System.out.println(ans);
    }
    public static int binaryCelingFloorCheck(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int middle = start + (end-start) / 2;
            if(target == arr[middle]){
                return middle;
            }
            else if(isAsc){
                if(target>arr[middle]){
                    start = middle+1;
                }else
                    end=middle-1;
            }
            else {
                if(target<arr[middle]) {
                    start = middle + 1;
                }
                    else
                        end = middle - 1;
            }
        }
        return start    ;
    }
}
