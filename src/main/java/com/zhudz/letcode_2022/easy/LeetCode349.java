package com.zhudz.letcode_2022.easy;

import java.util.HashSet;

/**
 * @Auther zhudezhong
 * @Description 349. 两个数组的交集
 */
public class LeetCode349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
	HashSet<Integer> set = new HashSet<>();
	HashSet<Integer> result = new HashSet<>();

	for (int i = 0; i < nums1.length; i++) {
	    set.add(nums1[i]);
	}

	for (int i = 0; i < nums2.length; i++) {
	    if (set.contains(nums2[i])) {
		result.add(nums2[i]);
	    }
	}
	int[] res = new int[result.size()];
	int index = 0;
	for(int i : result){
	    res[index++] = i;
	}

	return res;
    }

}