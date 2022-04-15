package com.zhudz.letcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 17. 电话号码的字母组合
 */
public class LeetCode17 {
    public List<String> letterCombinations(String digits) {
	map.put(2, "abc");
	map.put(3, "def");
	map.put(4, "ghi");
	map.put(5, "jkl");
	map.put(6, "mno");
	map.put(7, "pqrs");
	map.put(8, "tuv");
	map.put(9, "wxyz");
	if (digits.length() == 0) return result;

	backTrace(digits, 0);

	return result;
    }

    private HashMap<Integer, String> map = new HashMap<>();
    private List<String> result = new ArrayList<>();
    private StringBuilder path = new StringBuilder();

    private void backTrace(String digits, int index) {
	if (digits.length() == index) {
	    result.add(path.toString());
	    return;
	}

	String letter = map.get(digits.charAt(index) - '0');

	for (int i = 0; i < letter.length(); i++) {
	    path.append(letter.charAt(i));
	    backTrace(digits, index + 1);
	    path.deleteCharAt(path.length() - 1);
	}

    }


    public static void main(String[] args) {
	new LeetCode17().letterCombinations("23");
    }
}