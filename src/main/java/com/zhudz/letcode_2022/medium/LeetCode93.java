package com.zhudz.letcode_2022.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 93. 复原 IP 地址
 */
public class LeetCode93 {
    public List<String> restoreIpAddresses(String s) {
	backTracking(s,0,0);
	return result;
    }

    private List<String> result = new ArrayList<>();

    private void backTracking(String s,int index,int pointNum){
	if (pointNum == 3){
	    if (isValid(s, index, s.length() - 1))
		result.add(s);
	    return;
	}

	for (int i = index; i < s.length(); i++){
	    if (isValid(s,index,i)){
		s = s.substring(index,i + 1) + "." + s.substring(i + 1);
		pointNum++;
		backTracking(s,i + 2,pointNum);
		s = s.substring(index,i + 1) + s.substring(i + 2);
		pointNum--;
	    }else break;
	}
    }

    private boolean isValid(String s,int startIndex,int endIndex){
	if (startIndex > endIndex)
	    return false;

	if (s.charAt(startIndex) == '0' && startIndex != endIndex)
	    return false;

	int num = 0;
	for (int i = startIndex; i <= endIndex; i++) {
	    if (s.charAt(i) > '9' || s.charAt(i) < '0'){
		return false;
	    }

	    num = (s.charAt(i) - '0') + num * 10;
	    if (num > 255)
		return false;
	}
	return true;

    }
}