package com.zhudz.demo01;

import java.util.*;

public class ListClientExample {
    private List list;

    public ListClientExample() {
        list = new ArrayList();
        Deque deque = new LinkedList();
        Deque deque1 = new ArrayDeque();
    }

    private List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);
    }
}