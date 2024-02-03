import java.util.Arrays;

public class FirstAndLastElementPosition {
    public static void main(String[] args) {
        int[] arr = {2,4,5,5,5,5,6,7,8};
        int[] arr1 = {1,1,1,1,5,7,9};
//       int ans = searchResutl(arr,5,true);
//       int ans2= searchResutl(arr,5,false);
//        System.out.println(ans);
//        System.out.println(ans2);
        System.out.println(Arrays.toString(searchRance(arr1, 1)));
    }
    public static int[] searchRance(int[] nums, int target){
//        int[] arr = {-1,-1};
        int ans = searchResutl(nums,1,true);
        int ans2= searchResutl(nums,1,false);
        int[] arr = {ans,ans2};
        return arr;
            }

    public static int searchResutl(int[] nums,int target,boolean target1){
                int ans = -1;
                int start = 0;
                int end = nums.length-1;
                while(start<=end) {
                    int mid = start + (end - start) / 2;
                    if (target < nums[mid]) {
                        end = mid - 1;
                    } else if(target>nums[mid])
                        start = mid + 1;
                    else{
                        ans = mid;
                        if(target1){
                            end=mid-1;
                        }
                        else start=mid+1;
                    }
                }
                return ans;
            }
        }

