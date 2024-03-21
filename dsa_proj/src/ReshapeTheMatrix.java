import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        int ans = matrixReshape(arr);
        System.out.println(ans);
    }
        public static int matrixReshape ( int[] nums){
            if (nums.length == 0) {
                return 0;
            }
            int uniqueno = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[uniqueno] = nums[i];
                    uniqueno++;
                }
            }
            return uniqueno++;
        }
    }
