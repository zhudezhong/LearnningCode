package com.zhudz.datastructure.linearlist;

public class Main {
    public static void main(String[] args) {
        SqList sqList = new SqList();
        SqList.SqListStruct sq = new SqList.SqListStruct();

        //初始化线性表
        SqList.SqListStruct sqListStruct = sqList.initSqListStruct(sq);
        System.out.println("==============="+"Main中打印线性表：" + "===============");
        sqList.printSqList(sqListStruct);

        System.out.println("=========================================");
        System.out.println("线性表表长为：" + sqList.getSqListStructLength(sqListStruct));

        System.out.println("=========================================");
        sqList.sqListStructInsert(sqListStruct,1,1);
        sqList.printSqList(sqListStruct);

        System.out.println("=========================================");
        boolean b = sqList.sqListStructInsert(sqListStruct, 2, 3);
        boolean b1 = sqList.sqListStructInsert(sqListStruct, 3, 5);
        boolean b2 = sqList.sqListStructInsert(sqListStruct, 4, 3);
        boolean b3 = sqList.sqListStructInsert(sqListStruct, 5, 7);
        boolean b4 = sqList.sqListStructInsert(sqListStruct, 6, 9);
        System.out.println(b);
        sqList.printSqList(sqListStruct);

        System.out.println("移除元素：");
        sqList.sqListDelete(sqListStruct,2,100);
        sqList.printSqList(sqListStruct);
    }
}
