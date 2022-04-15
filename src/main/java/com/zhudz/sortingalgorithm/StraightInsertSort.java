package com.zhudz.sortingalgorithm;

import java.util.Arrays;

/**
 * 直接插入排序
 * 稳定性：稳定
 * 时间复杂度：O(n * n)
 */
public class StraightInsertSort {
    public static int[] straightInsertSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >=0 && arr[j] > tmp; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6};
        System.out.println(Arrays.toString(straightInsertSort(a)));
    }
}
