import java.util.Arrays;

public class FirstAndLastRange {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,8,8,9,10};
        int[] arr2 = {2,4,6,8,10,10,10,10,15};
        int[] arr3 = {0,0,0,0,2,4,6};
        int[] arr4 = {2,4,6,8,8,8,8,8};
//        int[] ans = searchRange(arr,8);
        System.out.println(Arrays.toString(searchRange(arr, 8)));
        System.out.println(Arrays.toString(searchRange(arr2, 10)));
        System.out.println(Arrays.toString(searchRange(arr3, 0)));
        System.out.println(Arrays.toString(searchRange(arr4, 8)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int ans1=searchFirstLast(nums,target,true);
        int ans2=searchFirstLast(nums,target,false);
        return new int[]{ans1,ans2};
    }
    public static int searchFirstLast(int[] nums,int target,boolean GetFirstDigit){
        int start=0;
        int end=nums.length-1;
        int ans = -1;
        while (start<=end){
            int mid=start + (end-start) / 2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=start+1;
            }
            else{
                ans=mid;
                if(GetFirstDigit){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
        }
        return ans;
    }
}
