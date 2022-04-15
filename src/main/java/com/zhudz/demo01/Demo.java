package com.zhudz.demo01;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /**
         * AI核心代码   HAHAHAH
         */
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            str = sc.next();
            str = str.replace("吗","");
            str = str.replace("？","!");
            str = str.replace("?","!");

            System.out.println(str);
        }
        //ystem.out.println("hello world");
    }
}
