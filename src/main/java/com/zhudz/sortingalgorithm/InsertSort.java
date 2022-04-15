package com.zhudz.sortingalgorithm;

import java.util.Arrays;

/**
 *  插入排序
 *  时间复杂度：O(n * n)
 *  空间复杂度：O(1)
 *  算法稳定性： 稳定
 */
public class InsertSort {
    /**
     * 直接插入排序   第一版
     * 升序排序
     * @param arr
     */
    public static void insertSort(int [] arr){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j = i;
                while (j > 0 && arr[j] < arr[j - 1]){
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                }
            };
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,7,3,4,5};
        insertSort(arr);
    }
}
