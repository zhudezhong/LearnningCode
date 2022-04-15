package com.zhudz.sortingalgorithm;

import java.util.Arrays;

/**
 * 冒泡排序算法
 * 稳定性：稳定
 * 时间复杂度：O(n * n)
 */
public class BubbleSort {
    /**
     * 冒泡排序算法
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
//                    int tmp = c;
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j] ^ arr[j + 1];
                    //swap(arr[j],arr[j+1]);
                }
            }
        }
        return arr;
    }

    public static void swap(Integer a,Integer b){
//        int tmp = a;
//        a = b;
//        b = tmp;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{9,1,5,4,6,8,2,1,4,7};

        int[] newArr = bubbleSort(arr);
        System.out.println((int) 'z');
        System.out.println(Arrays.toString(newArr));
    }
}
