package com.zhudz.letcode_2022.easy;

/**
 * 557. 反转字符串中的单词 III
 */
public class LeetCode557 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            revers(chars,0,chars.length);
            String s1 = String.valueOf(chars);

            sb.append(s1);
            if (i != strs.length - 1) sb.append(" ");
        }
        return sb.toString();
    }

    /**
     * 递归反转字符串
     * @param s
     * @param left
     * @param right
     */
    public void revers(char[] s,int left, int right){
        if (left >= right) return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        revers(s,++left,--right);
    }
}
