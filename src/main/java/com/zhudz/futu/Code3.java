package com.zhudz.futu;

/**
 * @Auther zhudezhong
 * @Description
 */
public class Code3 {
    public static int count = 0;
    public static String binSearch(int[] arr, int key) {
	// write code here
        int res = binSearchDp(arr, 0, arr.length - 1, key);
        return new StringBuilder().append(res).append(",").append(count).toString();
    }

    public static int binSearchDp(int[] arr,int left,int right,int key){
        if (left > right) return -1;

        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            count++;
            return mid;
        }

        if (arr[mid] > key){
            count++;
            return binSearchDp(arr,left,mid - 1,key);
        }else {
            count++;
            return binSearchDp(arr,mid + 1,right,key);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,6,7,9};
        System.out.println(binSearch(arr, 6));
    }
}