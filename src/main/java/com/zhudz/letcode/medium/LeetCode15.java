package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description
 */
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();


        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            //如果第一个元素大于0 直接返回结果
            if (nums[i] > 0) return result;

            //对i进行去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(left);
                    list.add(right);

                    //结果去重  可能存在这种情况：-1，-1，-1，-1，2，2，2，2，2
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    while (left < right && nums[left] == nums[left + 1]) left++;

                    left++;
                    right--;
                    result.add(list);
                }else if (sum > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }

        return result;
    }
}