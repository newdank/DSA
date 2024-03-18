import java.util.Arrays;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = concat(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] concat(int[] nums){
    int[] nums1 = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
            nums1[nums.length + i]=nums[i];
        }
        return nums1;
    }

}
