object TestDemo {

  def main(args: Array[String]): Unit = {
    val docs=Map("doc1"->List("hello","hehe"),"doc2"->List("hello","hi"))
    //Map("hello"->List("doc1","doc2"),"hi"->List("doc2"),"hehe"->List("doc1"))
    val tmp = docs.map(kv=>(kv._2.map(kv1=>(kv1,kv._1)))).flatten.groupBy(_._1).map(kv2=>(kv2._1,kv2._2.map(kv3=>kv3._2)))
    println(tmp.size)
    //返回元素，除了最后一个
    println(tmp.init)
    //返回最后一个元素
    println(tmp.last)
  }

}
