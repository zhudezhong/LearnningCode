package com.zhudz.sortingalgorithm;

import java.util.Arrays;

/**
 *  4. 简单选择排序
 */
public class EasySelectSort {
    /**
     *  简单选择排序
     * 时间复杂度：O（n * n）
     * 空间复杂度：O（1）
     * 稳定性：不稳定
     * 适用性：数组链表都适合
     * @param arr
     * @return
     */
    public int[] selectSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            if (min != i){
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }

    /**
     * 堆排序
     * @param arr
     * @return
     */
    public int[] heapSort(int[] arr){
        return arr;
    }



    public static void main(String[] args) {
        int[] ints = new EasySelectSort().selectSort(new int[]{1, 9, 6, 4, 3, 8, 5});
        System.out.println(Arrays.toString(ints));
    }
}
