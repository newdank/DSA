public class RBS {
    public static void main(String[] args) {
        int[] arr = {6,7,0,1,2,3,4,5};
       int ans = search(arr,10);
        System.out.println(ans);
    }

    public static int search(int[] nums,int target){
        int pivot = findPivot(nums);
        if(pivot==-1){
            return binarysearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }

    public static int binarysearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(target<nums[mid]){
                end=mid-1;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static int findPivot(int[] nums){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(end > mid && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            if(nums[end]>=nums[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
