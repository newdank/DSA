public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1},
                {4,2,1}
        };
        System.out.println(wealthCheck1(arr));
    }
//    public static int wealthCheck(int[][] arr){
//        int ans=0;
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < arr[i].length; j++) {
//                sum+=arr[i][j];
//            }
//            if(sum>ans){
//                ans = sum;
//            }
//        }
//        return ans;
//    }
    public static int wealthCheck1(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for(int[] a : arr){
            int sum=0;
            for(int b : a){
                sum+=b;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
