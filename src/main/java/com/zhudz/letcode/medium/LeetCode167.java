package com.zhudz.letcode.medium;

public class LeetCode167 {

    /**
     * 方法一：  暴力求解
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        if (n < 2) return numbers;

        int[] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 0; i < n; i++) {
            int num = target - numbers[i];
            /*
            //暴力求解
            for (int j = i + 1; j < n; j++) {
                if (num == numbers[j]){
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;
                }
            }
            */

            // 优化:  二分查找
            int low = i + 1;
            int high = n - 1;
            while (low < high){
                int mid = low + (high - low) / 2;
                if (num == numbers[mid]){
                    arr[0] = i + 1;
                    arr[1] = mid + 1;
                    return arr;
                }
                if (num > numbers[mid]){
                    low = mid + 1;
                }
                if (num < numbers[mid]){
                    high = mid - 1;
                }
            }

        }
        return arr;
    }

    /**
     * 方法二： 双指针
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum1(int[] numbers, int target){
        int n = numbers.length;
        if (n < 2) return numbers;

        int left = 0;
        int right = n - 1;

        while (left < right){
            int sum = numbers[left] + numbers[right];
            if (target == sum){
                return new int[]{left + 1,right + 1};
            }
            if (sum > target){
                right--;
            }else if (sum < target){
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
