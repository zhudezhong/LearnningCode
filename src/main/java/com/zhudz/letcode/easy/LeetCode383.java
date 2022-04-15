package com.zhudz.letcode.easy;

import java.util.HashMap;
import java.util.Set;

/**
 * @Auther zhudezhong
 * @Description   383. 赎金信
 */
public class LeetCode383 {
    /**
     * 方法一 ： 使用两个hashmap
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if (mag.containsKey(magazine.charAt(i))){
                mag.put(magazine.charAt(i),mag.get(magazine.charAt(i)) + 1);
            }else {
                mag.put(magazine.charAt(i),1);
            }
        }
        System.out.println(mag);

        for (int i = 0; i < ransomNote.length(); i++) {
            if (map2.containsKey(ransomNote.charAt(i))){
                map2.put(ransomNote.charAt(i),map2.get(ransomNote.charAt(i)) + 1);
            }else {
                map2.put(ransomNote.charAt(i),1);
            }
        }
        System.out.println(map2);

        Set<Character> kes2 = map2.keySet();
        System.out.println(kes2);
        for (Character c: kes2){
            if (!mag.containsKey(c)){
                return false;
            }

            if (map2.get(c) > mag.get(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 方法二： 使用数组来做为hash容器
     * 0相比方法一：降低了时间复杂度和空间复杂度
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct1(String ransomNote, String magazine){
        int[] nums = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            nums[magazine.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            nums[c - 'a']--;
            if (nums[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}