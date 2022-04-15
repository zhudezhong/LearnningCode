package com.zhudz.letcode.easy;

/**
 * 704. 二分查找
 */
public class LeetCode704 {
    /**
     * 二分查找
     * 事件复杂度： O(log n)  n为数组长度
     * 空间复杂度： O(1)
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int low = 0;
        int hight = nums.length - 1;
        int mid;

        while (low <= hight){
            mid = (low + hight) / 2;

            if (nums[mid] == target) return mid;

            if (nums[mid] < target){
                low = mid + 1;
            }

            if (nums[mid] > target){
                hight = mid - 1;
            }
        }
        return -1;
    }
}
