package com

import javax.sql.rowset.Joinable

import scala.collection.mutable._

object HelloWorld {

  def test(): Unit = {
    val l1 = List.apply(1, 2, 3, 4)
    val l2 = List(1, 2, 3, 4)
    println(l1)
    println(l2)
    l1.foreach(println)
  }

  def testmap(): Unit = {
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    print(colors.map(x => (x._2, x._1)))
  }

  def testunion(): Unit = {
    val rdd1 = List(1, 2, 3, 4)
    val rdd2 = List(5, 6)
    val unionres = rdd1 union rdd2
    print(unionres)
  }

  /* def testjoin(): Unit = {
    val rdd1=List((1,"spker"),(2,"hive"),(3,"java"))
    val rdd2=List((1,"30k"),(2,"20k"),(3,"10k"))
    val res = rdd1 join rdd2
    print(res)
  }*/
  //1,3,5
  /*def getMax(list: List[Int]): Int = {
    if (list.size == 1) list.head
    else {
      val left =list.filter(x => x > list.head)
      if (left.size == 0) list.head
      else getMax(left)
    }
  }*/

  def getMax(list: List[Int]):Int = {
    if (list.size==1) list.head
    else {
      getMax(list.tail.filter(x=>x>=list.head))
    }
  }

  def sort(list: List[Int]): List[Int] = {
    val r = getMax(list)
    if (list.size == 1) list
    if (list.size == 0) Nil
    else {
      sort(list.filter(x => x < r)) ::: list.filter(x => x == r)
    }
  }


 /* def getMax(list: List[Int]): Unit = {
    if (list.size == 1) list.head
    else {
      val left = list.filter(x => x > list.head)
      if (list.size == 0) list.head else getMax(left)
    }
    print(list.head)
  }*/


  // 快速排序：它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
  // 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
  def quickSort(a:List[Int]):List[Int]={
    if (a.length < 2) a
    else quickSort(a.filter(_ < a.head)) ++
      a.filter(_ == a.head) ++
      quickSort(a.filter(_ > a.head))
  }


  def test2(): Unit = {
    val a1=List("a","h","a","k")
    //a1.map((_,1)).groupBy(_._1).mapValues(_.size).foreach(println)
    a1.groupBy(x=>x).map(kv=>(kv._1,kv._2.size)).foreach(println)
  }

  def main(args: Array[String]): Unit = {
    //test()
    //testmap()
    //testunion()
    //testjoin()
    val list = List(1, 2, 4, 5, 3, 5)
    val map = Array(2,4,6,5)
    //print(list.zip(map).toMap)
    //println(getMax(list))
    //println(sort(list))

   // println(quickSort(List(1,3,2,9,5,7)))

   // print(list.sortWith(_>_));

   /* val mm = Map(("hello",1),("spakr",2))
    mm("henan")=3
    mm += (("xinyang",4))
    mm.put("renhe",5)
    print(mm.map(x=>(x._2,x._1)))*/

    //test2()

  }
}


