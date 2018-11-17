object TestDemo {
      trait Play{
        def  basketball()
        def  football(): Unit ={
          println("football 78")
        }
      }
      trait Sing{
        def  sing()
      }

    class  Dog extends  Sing{
      override def sing(): Unit = {
        println("wang wang 12 ")
      }
    }
  class Pig extends  Sing with  Play{
    override def sing(): Unit = {
      println("hen hen 34")
    }

    override def basketball(): Unit = {
      println("basketball 56")
    }

  }

  def main(args: Array[String]): Unit = {
    new Dog().sing()
    new Pig().sing()
    new Pig().basketball()
    new Pig().football()
  }
}
