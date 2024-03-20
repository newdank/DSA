public class BestTimeToBuyAndSellAStock {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {2,1,2,0,1};
        int ans = maxProfits(prices1);
        System.out.println(ans);
    }

    public static int maxProfits(int[] prices) {
    int start = 0;
    int end = prices.length-1;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[start]<min){
                    min = prices[i];
                    start++;
                }
                if(prices[end]>max){
                    max = prices[end];
                    end--;
                }
            }
        if(min>max){
            return 0;
        }

    return max-min;
    }

}
