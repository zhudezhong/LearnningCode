package com.zhudz.letcode_2022.easy;

import java.util.HashMap;

/**
 * @Auther zhudezhong
 * @Description 454. 四数相加 II
 */
public class LeetCode454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1){
            for (int j: nums2){
                int sum = i + j;
                if (map.containsKey(sum)){
                    map.put(sum,map.get(sum) + 1);
                }else {
                    map.put(sum,1);
                }
            }
        }

        int count = 0;
        for (int i : nums3){
            for (int j: nums4){
                int sum = 0 - ( i + j );
                if (map.containsKey(sum)){
                    count += map.get(sum);
                }
            }
        }
        return count;
    }
}