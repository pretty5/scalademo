package com

object WordCount {


  /*def wordcount(arr: List[String]): Unit = {
    arr.map(_.split(" "))
    //list.flatten
  }
*/
  def main(args: Array[String]): Unit = {
    val arr = List("hello henan hello zhengzhou", "hello xinyang hello huangchuan")
   // print(arr.map(_.split(" ")).flatten.map((_,1)).groupBy(_._1).map(x=>(x._1,x._2.size)).toList.sortWith(_._2>_._2));
    print(arr.map(_.split(" ")).flatten.map((_,1)).groupBy(_._1).mapValues(_.size));
  }

}
