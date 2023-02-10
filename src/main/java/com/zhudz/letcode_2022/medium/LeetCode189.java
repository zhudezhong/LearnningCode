package com.zhudz.letcode_2022.medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 189. 轮转数组
 */
public class LeetCode189 {
    public void rotate(int[] nums, int k) {

        Deque<Integer> deque = new ArrayDeque<>();

        //1. 将数组中所有元素放入到队列中
        for (int i = nums.length - 1; i >= 0; i--) {
            deque.add(nums[i]);
        }

        //2. 根据k的来进行队头元素出队，再将队头元素加入到队尾
        while (k != 0){
            Integer first = deque.removeFirst();
            deque.addLast(first);
            k--;
        }

        //3. 将队列中的元素重新赋值给nums数组
        int i = nums.length - 1;
        while (deque.size() != 0){
            nums[i--] = deque.removeFirst();
        }

        System.out.println(Arrays.toString(nums));
    }
}
