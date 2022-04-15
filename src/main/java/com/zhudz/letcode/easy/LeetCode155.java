package com.zhudz.letcode.easy;

/**
 *   155. 最小栈
 */

public class LeetCode155 {
    class MinStack {
        private static final int SIZE = 20;
        int[] stack;
        int size;

        /**
         *  初始化堆栈对象
         */
        public MinStack() {
            stack = new int[SIZE];
            size = 0;
        }

        public void push(int val) {
            if (size < SIZE){
                stack[size++] = val;
            }
        }

        public void pop() {
            if (size > 0) stack[--size] = 0;
        }

        public int top() {
            return size == 0 ? -1 : stack[size - 1];
        }

        public int getMin() {
            if (size > 0){
                int min = stack[0];
                for (int i = 1; i < size; i++) {
                    if (stack[i] < min) min = stack[i];
                }
                return min;
            }else {
                return -1;
            }
        }
    }
}
