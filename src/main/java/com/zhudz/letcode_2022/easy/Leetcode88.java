package com.zhudz.letcode_2022.easy;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 */
public class Leetcode88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newInt = new int[m + n];

        int left = 0;
        int right = 0;

        for (int i = 0; i < m + n; i++) {
            if (left == m) {
                newInt[i] = nums2[right++];
                continue;
            }
            if (right == n){
                newInt[i] = nums1[left++];
                continue;
            }

            if (nums1[left] < nums2[right]){
                newInt[i] = nums1[left++];
            }else {
                newInt[i] = nums2[right++];
            }
        }
        System.out.println(Arrays.toString(newInt));
        for (int i = 0; i < m + n; i++) {
            nums1[i] = newInt[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {};
        merge(nums1,3,nums2,0);
    }
}
