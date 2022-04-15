package com.zhudz.demo01;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,2,4,3,1,7,8,2};
        String sb = "WRWRRWWRRW";
        int k = 4;

        System.out.println(demo(arr, sb, k));


       // System.out.println(min);
    }

    public static int demo(int[] arr,String sb,int k){
        int min = 0;
        int sum = 0;
        //if(k > arr.length) return;
        for(int i = 0; i < arr.length - k; i++){
            for(int j = 0; j < k;j++){
                if(sb.charAt(i + j) == 'W'){
                    sum += arr[i + j];
                }
            }
            //第一次将min赋值为sum
            if(i == 0) min = sum;

            if(sum < min && i > 0) min = sum;
            sum = 0;
        }
        return min;
    }
}
