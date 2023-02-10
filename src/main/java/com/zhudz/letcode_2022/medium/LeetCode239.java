package com.zhudz.letcode_2022.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther zhudezhong
 * @Description
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();


        int[] res = new int[nums.length - k + 1];
        int count = 0;

        int j = k;
        for (int i = 0; i < nums.length;) {
            int max = nums[i];

            while (j > 0){
                if (nums[i] > max) max = nums[i];
                deque.offer(nums[i]);
                i++;
                j--;
            }
            res[count++] = max;
            deque.pollFirst();
            j = k;
        }
        return nums;
    }
}