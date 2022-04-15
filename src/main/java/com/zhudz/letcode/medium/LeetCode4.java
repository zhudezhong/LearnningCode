package com.zhudz.letcode.medium;

/**
 * @Auther zhudezhong
 * @Description 4. 寻找两个正序数组的中位数
 */
public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	int m = nums1.length;
	int n = nums2.length;

	int length = m + n;
	int mid = length / 2;
	int res = -1;
	int i = 0;
	int j = 0;
	int count = 0;
	while (i < m || j < n){
	    while (j < n && nums1[i] > nums2[j]) {
		count++;
		if (count == mid)
		j++;
	    }
	    while (i < m && nums1[i] < nums2[j]) {
		count++;
		i++;
	    }
	}
	return  res;
    }
}