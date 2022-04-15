package com.zdz.spark

import org.apache.spark.{Partition, SparkConf, SparkContext}

object Demo1 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local[*]").setAppName("test1")
    val sc = SparkContext.getOrCreate(conf)
    sc.setLogLevel("error")

    val list = List(1, 3, 5, 7, 9, 2, 4, 6, 8)
    val rdd1 = sc.parallelize(list)

    val rdd2 = rdd1.map(x => x * 10)
    //    rdd2.foreach(println)
    val partitions = rdd1.getNumPartitions
    println(partitions)
  }
}
