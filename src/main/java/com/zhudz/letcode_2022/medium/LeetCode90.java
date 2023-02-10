package com.zhudz.letcode_2022.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description 90. 子集 II
 */
public class LeetCode90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        backTrack(nums,0);
        return result;
    }

    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    private void backTrack(int[] nums,int index){
        result.add(new ArrayList<>(path));
        if (index == nums.length){
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1])
                path.add(nums[i + 1]);
            backTrack(nums,i + 1);
            path.removeLast();
        }
    }
}