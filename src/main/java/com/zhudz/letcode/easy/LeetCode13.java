package com.zhudz.letcode.easy;

import java.util.HashMap;

/**
 *  13. 罗马数字转整数
 */
public class LeetCode13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        if (s.length() < 2) return map.get(s.charAt(0));
        for (int i = 0; i < s.length(); ) {
            if (i != s.length() -1) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    sum += 4;
                    i += 2;
                    continue;
                }
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    sum += 9;
                    i += 2;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i += 2;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i += 2;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i += 2;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i += 2;
                    continue;
                }
            }
            sum += map.get(s.charAt(i++));
        }
        return sum;
    }

    public static void main(String[] args) {
        new LeetCode13().romanToInt("MCMXCIV");
    }
}
