object TraitDemo {
  trait Play{
    def basketball()
    def football()={
      println("play football")
    }
  }
  trait Sing{
    def sing
  }

  class Dog extends Sing{
    override def sing: Unit = {
      println("wang wang wang")
    }

  }

  class Pig extends Sing with Play{
    override def sing: Unit = {
      println("heng heng heng")
    }

    override def basketball(): Unit = {
      println("play basketball")
    }
  }

  def main(args: Array[String]): Unit = {
    new Dog().sing
    new Pig().sing
    new Pig().basketball()
    new Pig().football()

  }

}



