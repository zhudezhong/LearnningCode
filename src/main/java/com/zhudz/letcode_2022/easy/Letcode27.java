package com.zhudz.letcode_2022.easy;

/**
 * 27. 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 */
public class Letcode27 {
    public static int removeElement(int[] nums, int val) {
	int pre = 0, cur = 0;
	while (cur < nums.length) {
	    if (nums[cur] == val) cur++;
	    else {
		nums[pre++] = nums[cur++];
	    }
	}
	return pre;
    }

    public static void main(String[] args) {
	System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}
