package com.zhudz.letcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther zhudezhong
 * @Description  349. 两个数组的交集
 */
public class LeetCode349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                res.add(nums2[i]);
        }
        System.out.println(res.size());
        int[] result = new int[res.size()];
        int index = 0;

        for (int i : res){
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    }
}