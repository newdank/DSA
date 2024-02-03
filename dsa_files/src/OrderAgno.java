public class OrderAgno {
    public static void main(String[] args) {
        int[] arr = {100, 90, 88, 77, 66,50, 44, 33,20,11,9,5,3,1,-9,-89,-100};
        int ans = orderagno(arr,95);
        System.out.println(ans);
    }
    public static int orderagno(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(target == arr[mid])
                return mid;
            else if(isAsc){
                if(target<arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else{
                if(target>arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
