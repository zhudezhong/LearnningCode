package com.zhudz.flink_api_practice.wc;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther zhudezhong
 * @Description
 */
public class WordCount {
    public static void main(String[] args) {

        //1 创建执行环境
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        //2 从文件中读取数据
        String path = "";
        DataSet<String> ds = env.readTextFile(path);

        //3 对数据集进行处理

    }
}