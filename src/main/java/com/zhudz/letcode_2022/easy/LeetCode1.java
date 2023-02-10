package com.zhudz.letcode_2022.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther zhudezhong
 * @Description  1. 两数之和
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        //map集合中存放 <数组元素值，下标>
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //mpa集合中存在
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else {
                map.put(nums[i],i );
            }
        }

        return new int[]{-1,-1};
    }
}