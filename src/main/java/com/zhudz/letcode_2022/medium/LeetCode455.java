package com.zhudz.letcode_2022.medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Auther zhudezhong
 * @Description 455. 分发饼干
 */
public class LeetCode455 {
    public int findContentChildren(int[] g, int[] s) {
        int max = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        boolean[] used = new boolean[s.length];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i] && used[j]){
                    max++;
                    used[j] = false;
                }
            }
        }

        Stack<Object> stack = new Stack<>();

        return max;
    }
}