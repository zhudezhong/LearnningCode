package com.zhudz.sortingalgorithm;

import java.util.Arrays;

/**
 * 快速排序算法
 * 稳定性： 不稳定
 * 时间复杂度：最坏O(n * n),平均时间复杂度：O(n * log n)
 */
public class QuickSort {
    public static int[] quickSort(int[] arr,int left,int right){

        if (left < right){
            int i = left;
            int j = right;
            int x = arr[i];

            while (i < j){
                while (i < j && arr[j] > x){
                    //从右向左找第一个小于x的数
                    j--;
                }
                if (i < j){
                    arr[i++] = arr[j];
                }

                while (i < j && arr[i] < x){
                    //从左向右找第一个大于x的数
                    i++;
                }
                if (i < j){
                    arr[j --] = arr[i];
                }
                arr[i] = x;
                quickSort(arr,left,i - 1);
                quickSort(arr,i + 1,right);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[] = {30,40,60,10,20,50};
        System.out.println(Arrays.toString(quickSort(a,0,a.length - 1)));
    }
}
