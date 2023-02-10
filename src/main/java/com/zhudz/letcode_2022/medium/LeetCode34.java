package com.zhudz.letcode_2022.medium;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};

        int low = 0;
        int high = nums.length - 1;

        if (high <= 0) return nums;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] == target){
                //找到左边第一个小于target的元素的位置
                ans[0] = findFirstTarget(nums,low,mid - 1,target);
                //找到右边最后一个等于target的元素
                ans[1] = findLasttTarget(nums,mid + 1,high,target);
                return ans;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }
            else if (nums[mid] > target){
                high = mid - 1;
            }
        }

        return ans;
    }

    /**
     * 找到第一个比target小的位置
     * @param nums
     * @param start
     * @param end
     * @param target
     * @return
     */
    public int findFirstTarget(int[] nums,int start,int end,int target){
        while (start != end){
            //找到第一个比target小的位置
            if (nums[end] < target){
                return end + 1;
            }
            end--;
        }
        return nums[end] == target ? end : end + 1;
    }

    public int findLasttTarget(int[] nums,int start,int end,int target){
        while (start != end){
            //找到第一个比target小的位置
            if (nums[start] > target){
                return start - 1;
            }
            start++;
        }
        return nums[start] == target ? start : start - 1;
    }
}
