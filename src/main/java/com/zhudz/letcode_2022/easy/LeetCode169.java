package com.zhudz.letcode_2022.easy;

import java.util.HashMap;
import java.util.Set;

/**
 * @Auther zhudezhong
 * @Description 169. 多数元素
 */
public class LeetCode169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        }
        Set<Integer> keys = map.keySet();
        int res = nums[0];
        int len = nums.length / 2;
        for (int k: keys){
            if (map.get(k) > len) res = k;
        }
        return res;
    }
}