public class MountanPeakArray {
    public static void main(String[] args) {
        int[] arr = {10,60,30,15,5,30};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {
       int start=0;
       int end=arr.length-1;
       while(start<end){
           int mid = start+(end-start) / 2 ;
           if(arr[mid+1]>arr[mid]){
               start=mid;
           }
           else
               end=mid;
           if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
               return mid;
           }
       }
       return -1;
    }
}
