import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int[] ans = runningsum(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] runningsum(int[] nums){
        int[] nums1 = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            counter+=nums[i];
            nums1[i] = counter;
        }


        return nums1;
    }

}
