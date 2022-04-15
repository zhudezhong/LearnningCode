package com.zhudz.demo01;

/**
 * @Auther zhudezhong
 * @Description
 */
public class Code1 {
    public int[] solve(int n, int m, int[] a) {

	int res = m % n;
	int i = n - 1;
	while (res-- > 0) {
	    int tmp = a[i];
	    for (int j = n - 1; j > 0; j--) {
		a[j] = a[j - 1];
	    }
	    a[0] = tmp;
	}
	return a;
    }
}