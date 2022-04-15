package com.zhudz.letcode.medium;

import java.util.*;

public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i] + 1));
            }else {
                map.put(nums[i],1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> deque = new PriorityQueue<>((o1,o2) -> o1.getValue() - o2.getValue());
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();

        for (Map.Entry<Integer,Integer> entry : entries){
            deque.offer(entry);
            if (deque.size() > k){
                deque.poll();
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--){
            res[i--] = deque.poll().getKey();
        }
        return res;
    }
}
