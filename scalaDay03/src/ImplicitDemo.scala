
object ImplicitDemo {
  class Dog{
    def sing={
      println("wang wang wang")
    }
  }
  //定义隐式函数需要需要加上implicit关键字
  //implicit def dogToString(dog: Dog)="dog"
  implicit  def  dogToInt(dog:Dog)="100".toInt
  //定义隐式类需要需要加上implicit关键字
  implicit class RichDog(dog: Dog){
    def singOpera={
      println("bei jing opera")
    }
    //定义隐式值需要需要加上implicit关键字
    def say(implicit a:Int)=println(a)
  }
  def main(args: Array[String]): Unit = {
    new Dog().sing
    //隐式类转换
    new Dog().singOpera
    //隐式函数转换
    //println(new Dog()+"abc")
    //隐式值
    implicit val a=1;
    new Dog().say
    println(new Dog()/2)
  }
}