package com.zhudz.futu;

import java.util.Scanner;

/**
 * @Auther zhudezhong
 * @Description
 */
public class Code1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int count = 0;
	int j = 3;
	while (n-- > 0){
	    while (j-- > 0) {
		int i = Integer.parseInt(sc.next());
		if (i == 6) count++;
	    }
	    if (count == 1) System.out.println("500");
	    else if (count == 2) System.out.println("1000");
	    else if (count == 3) System.out.println("2000");
	    else System.out.println("100");
	    count = 0;
	    j = 3;
	}
    }
}