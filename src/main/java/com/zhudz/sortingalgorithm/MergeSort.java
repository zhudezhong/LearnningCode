package com.zhudz.sortingalgorithm;

import java.util.Arrays;

/**
 * @Auther zhudezhong
 * @Description 归并排序（MergeSort）
 * 时间复杂度： O（n * log2 n）
 * 空间复杂度： O (n)
 * 稳定排序算法
 */
public class MergeSort {
    /**
     * 合并两个有序数组
     * @param nums1
     * @param nums2
     */
    public static void MergeSort(int[] nums1,int[] nums2){

        int len = nums1.length + nums2.length;

        int[] nums3 = new int[len];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length || j < nums2.length){
            if (i == nums1.length){
                nums3[k++] = nums2[j++];
                continue;
            }
            if (j == nums2.length){
                nums3[k++] = nums1[i++];
                continue;
            }
            if ( nums1[i] <= nums2[j]){
                nums3[k++] = nums1[i++];
            }else{
                nums3[k++] = nums2[j++];
            }
        }
        System.out.println(Arrays.toString(nums3));
    }

    /**
     * 归并排序     对low，high范围内对元素进行排序
     * @param nums
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(int[] nums,int low,int mid,int high){
        int i,j,k;
        int[] arr = new int[nums.length];

        for (k = low; k <= high; k++) {
            arr[k] = nums[k];
        }

        for (i = low,j = mid + 1,k = i; i <= mid && j <= high; k++){
            if (arr[i] <= arr[j]){
                nums[k] = arr[i++];
            }else {
                nums[k] = arr[j++];
            }
        }

        while (i <= mid) nums[k++] = arr[i++];
        while (j <= high) nums[k++] = arr[j++];
    }

    public static void mergeSort(int[] nums,int low,int high){
        if (low < high){
            int mid = (low + high) / 2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid + 1,high);
            merge(nums,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,8,10,21,5,4,2};
        int[] arr1 = {3,4,5,100,200};

        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
        //MergeSort(arr1,arr);
    }
}