package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description  18. 四数之和
 */
public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;
                int sub = target - (nums[i] + nums[j]);

                while (left < right){
                    int sum = nums[left] + nums[right];
                    if (sum > sub) right--;
                    else if (sum < sub) left++;
                    else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
}