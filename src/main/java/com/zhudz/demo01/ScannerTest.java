package com.zhudz.demo01;

import java.util.Scanner;

/**
 * @Auther zhudezhong
 * @Description
 */
public class ScannerTest {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          //2.提示用户输入
          System.out.println("请输入一个整数：");
          //3.调用输入方法,并输出
          int num = sc.nextInt();
          System.out.println("num:" + num);

          //接受并输出，字符串
          System.out.println("请输入一个字符串：");
          String str = sc.nextLine();
          System.out.println("str:" + str);
     }
}