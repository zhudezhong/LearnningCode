package com.zhudz.letcode_2022.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 131. 分割回文串
 */
public class LeetCode131 {
    public List<List<String>> partition(String s) {
        backTrace(s,0);
        return list;
    }

    private List<List<String>> list = new ArrayList<>();
    private LinkedList<String> path = new LinkedList<>();

    private void backTrace(String s,int index) {
        if (index == s.length()){
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalidrome(s,index,i)){
                String str = s.substring(index, i + 1);
                path.add(str);
            }else continue;
            backTrace(s,i + 1);
            path.removeLast();
        }
    }

    private boolean isPalidrome(String s,int start,int end){
        while (start <= end){
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}