package com.zhudz.letcode.easy;

import java.util.Arrays;

/**
 * 27. 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 */
public class Letcode27 {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
         int rigth = 0;
        while (rigth < nums.length){
            if (nums[rigth] == val){
                rigth++;
            }else {
                nums[left++] = nums[rigth++];
//                left++;
//                rigth++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}
