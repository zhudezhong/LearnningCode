package com.zhudz.letcode_2022.easy;

/**
 * 121. 买卖股票的最佳时机
 */
public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length && prices[j] > prices[i]; j++) {
                int profit  = prices[j] - prices[i];
                max = max > profit ? max : profit;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        new LeetCode121().maxProfit(price);
    }
}
