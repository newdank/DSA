import java.util.Arrays;
import java.util.HashMap;

public class TwoSumArrayUsingHashMaps {
    public static void main(String[] args) {
        int[] nums = {7,2,2,7,11,7,15};
        int[] arr = twoSum(nums,9);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int finaltarget = target - nums[i];
            if(map.containsKey(finaltarget)){
                return new int[] {map.get(finaltarget),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
