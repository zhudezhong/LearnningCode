package com.zhudz.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 228. 汇总区间
 */
public class LeetCode228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;


        while (i < nums.length){
            int start = i;
            i++;
            while (i < nums.length && nums[i] - nums[i - 1] == 1){
                i++;
            }
            StringBuilder sb = new StringBuilder();
            if (start != i - 1) sb.append(nums[start]).append("->").append(nums[i - 1]);
            else sb.append(nums[start]);
            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        new LeetCode228().summaryRanges(new int[]{0,1,2,4,5,7});
    }
}