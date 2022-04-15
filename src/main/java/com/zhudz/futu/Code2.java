package com.zhudz.futu;

import java.util.Scanner;

/**
 * @Auther zhudezhong
 * @Description
 */
public class Code2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int M = Integer.parseInt(sc.next());
	int P = Integer.parseInt(sc.next());
	int Q = Integer.parseInt(sc.next());

	int result = 0;
	int start = P;
	while (N > 0){
	    result++;
	    if (result % 12 == P && P <= Q && P >= start){
		N = N - 2 * M;
		P = (P + 1) % 12;
	    }else {
		N = N - M;
		P = start;
	    }
	}
	System.out.println(result);
    }
}