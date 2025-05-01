package DSA.TwoPointers;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0, right = 1;
        while (left < prices.length && right < prices.length) {
            int profit = prices[right] - prices[left];
            if (prices[left] > prices[right]) {
                left++;
                right = left + 1;
            } else {
                if (profit > maxProfit) {
                    maxProfit = profit;
                }

                right++;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new BuySellStock().maxProfit(new int[]{10, 9, 8, 7, 7, 1}));
    }
}
