object Dog {


  val add=(x:Int,y:Int)=>x+y

  def main(args: Array[String]): Unit = {

    val res=cal(new Function2[Int,Int,Int] {
      override def apply(v1: Int, v2: Int): Int =v1+v2
    },1,2)
    println(res)
  }
  def sing()={
    println("wang wang")
  }
  def wordcount={
    import scala.collection.JavaConverters._
    val l1=List("h","a","h")
    l1.groupBy(x=>x).map(kv=>(kv._1,kv._2.size)).asJava
  }
  def cal(f:(Int,Int)=>Int,num1:Int,num2:Int)=f(num1,num2)

}
class Dog{
  def play={
    println("play play")
  }
}
