package com.zhudz.sortingalgorithm;

import java.util.Arrays;

/**
 * @Auther zhudezhong
 * @Description 堆排序
 * 时间复杂度：O（n log2 n）
 * 空间复杂度：O（1）
 * 不稳定
 */
public class HeapSort {
    /**
     * 1. 建立大根堆
     * @param array
     */
    public static void BuildMaxHeap(int[] array,int len){
//        int len = array.length;
        for (int i = len / 2; i > 0; i--) {
            HeadAdjust(array,i,len);
        }
        array[0] = 0;
    }

    /**
     * 2. 堆元素下坠过程
     * @param array
     * @param k
     * @param len
     */
    private  static void HeadAdjust(int[] array, int k, int len) {
        array[0] = array[k];
        for (int i = 2 * k; i <= len; i *= 2) {
            if (i < len && array[i] < array[i + 1])
                i++;
            if (array[0] > array[i]) break;
            else {
                array[k] = array[i];
                k = i;
            }
        }
        array[k] = array[0];
    }

    /**
     * 3. 堆排序
     * @param array
     * @param len
     */
    public static void HeapSort(int[] array,int len){
        //1. 对一个乱序数组建立大根堆，即初始化一个堆
        BuildMaxHeap(array,len);

        //2.将堆顶元素和堆底元素互换位置，然后对剩余元素进行又一次建立大根堆堆过程
        for (int i = len; i > 1; i--) {
            //2.1 将堆顶元素和堆底元素互换位置,即最大堆元素放到数组末尾
            int temp = array[i];
            array[i] = array[1];
            array[1] = temp;

            //堆剩余元素再进行建立大根堆
            HeadAdjust(array,1,i - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,9, 1, 10, 12,21,3,4,6,3,5,10,33,45,18};

        HeapSort(nums,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}