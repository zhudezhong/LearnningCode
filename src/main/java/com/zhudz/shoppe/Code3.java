package com.zhudz.shoppe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther zhudezhong
 * @Description
 */
public class Code3 {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // write code here
        //1. 判断可以启动项目有哪些
        ArrayList<Integer> capitals = new ArrayList<>();
        for (int i : capital) {
            capitals.add(i);
        }
        List<Integer> projects = new ArrayList<>();
        projects = projectsStart(w, capitals, projects);
        System.out.println("projects1:" + projects);
        //1.1 如果没有可启动的项目 直接返回0；
        if (!isStart(projects)) return 0;

        //2. 找到利润最大的项目，优先启动
        //2.1 存储利润的集合
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : profits) {
            list.add(i);
        }
        //System.out.println("profits1:" + list);

        while (k-- > 0 && isStart(projects)) {
            int maxProfit = maxProfitProject(projects, list);
            projects = projectsStart(w, capitals, projects);
            w += maxProfit;
        }

        return w;
    }

    //判断可以启动哪些项目
    public static List<Integer> projectsStart(int w, List<Integer> cacapital, List<Integer> projects) {
        //ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < cacapital.size(); i++) {
            if (cacapital.get(i) <= w) {
                cacapital.remove(cacapital.get(i));
                projects.add(i);
            }
            ;
        }
        return projects;
    }

    //判断是否可以启动项目
    public static boolean isStart(List list) {
        if (list.size() == 0) return false;
        else return true;
    }

    //找到利润最大的项目
    public static int maxProfitProject(List<Integer> projects, List<Integer> list) {
        int maxProfit = 0;
        int project = -1;

        for (int i = 0; i < projects.size(); i++) {
            int profit = list.get(projects.get(i));
            if (profit > maxProfit) {
                maxProfit = profit;
                project = i;
            }
        }
        //将做过的项目和利润删除
        projects.remove(project);
        list.remove(maxProfit);
        return maxProfit;
    }

    public static void main(String[] args) {
        int k = 2;
        int w = 0;
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {0, 1, 1};

        System.out.println(findMaximizedCapital(k, w, arr1, arr2));
    }
}