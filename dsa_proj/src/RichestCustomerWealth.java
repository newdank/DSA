public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1},{10,1,1}};
        int ans = maxwealth(accounts);
        System.out.println(ans);
    }
    public static int maxwealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }


}
