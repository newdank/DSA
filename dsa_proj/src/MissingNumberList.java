import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberList {
    public static void main(String[] args) {
    int[] nums = {4,3,2,7,8,2,3,1};
    List<Integer> list = new ArrayList<>();
    list = missing(nums);
//        System.out.println(Arrays.toString());
        for(int i : list){
            System.out.println(i);
        }

    }

    public static List<Integer> missing(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[correct]!=nums[i]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
            list.add(j+1);
            }
        }
        return list;
    }

    public static void swap (int[] arr, int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
