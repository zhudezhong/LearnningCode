package com.zhudz.datastructure.linearlist;

import java.util.Arrays;

/**
 * 自定义数据结构：线性表
 */
public class SqList {
    private static final int MAXSIZE = 10;

    /**
     * 定义一个线性表，其初始容量为10
     */
    static class SqListStruct {
        int[] data =  new int[MAXSIZE];
        int length;

        @Override
        public String toString() {
            return "SqListStruct{" +
                    "data=" + Arrays.toString(data) +
                    ", length=" + length +
                    '}';
        }
    }

    /**
     * 线性表的初始化
     * @param sqListStruct
     * @return
     */
    public SqListStruct initSqListStruct(SqListStruct sqListStruct){
        for (int i = 0; i < MAXSIZE; i++) {
            sqListStruct.data[i] = 0;
        }
        sqListStruct.length = 0;
        return sqListStruct;
    }

    /**
     * 求线性表表长
     * @param sqListStruct
     * @return
     */
    public int getSqListStructLength(SqListStruct sqListStruct){
        return sqListStruct.length;
    }

    /**
     * 线性表的插入操作
     * @param sqListStruct  待插入元素的线性表
     * @param i 插入的位置
     * @param element 需要插入的位置
     * @return
     */
    public boolean sqListStructInsert(SqListStruct sqListStruct,int i,int element){
        //判断插入的位置是否有效
        if (i < 1 || i > sqListStruct.length + 1)
            return false;

        //当前存储空间已满，不能插入
        if (sqListStruct.length >= MAXSIZE)
            return false;

        //将第i个位置之后的元素 后移一位
        int[] data = sqListStruct.data;
        for (int j = sqListStruct.length; j >= i ; j--) {
            data[j] = data[j - 1];
        }
        data[i - 1] = element;
        sqListStruct.length +=1;
        return true;
    }

    /**
     * 线性表的删除元素操作
     * @param sqListStruct 需要删除元素的线性表
     * @param i 删除顺序表中的第i个位置的元素
     * @param element 将删除的第i个位置的元素的值赋给element元素
     * @return
     */
    public boolean sqListDelete(SqListStruct sqListStruct,int i,int element){
        //判断位置i是否合法
        if (i < 1 || i > sqListStruct.length)
            return false;
        int[] data = sqListStruct.data;
        element = data[i - 1];
        //将所有元素前移一位
        for (int j = i; j < sqListStruct.length; j++) {
            data[j - 1] = data[j];
        }
        sqListStruct.length--;
        return true;
    }

    /**
     * 打印该线性表
     * @param sqListStruct
     */
    public void printSqList(SqListStruct sqListStruct){
        //int[] data = sqListStruct.data;
        if (sqListStruct.length == 0){
            System.out.println("该线性表为空！！");
            return;
        }
        for (int i = 0; i < sqListStruct.length; i++) {
            System.out.print(sqListStruct.data[i] + "\t");
        }
        System.out.println();
        System.out.println("线性表的长度为：" + sqListStruct.length);
    }
}
