package cn.peter.hello

class Application {
  val name: String = "app" + System.currentTimeMillis()
  def getName: String ={
    name
  }
}

object Application{
  def main(args: Array[String]): Unit = {
    println("你好")
    println("hello")
  }

  def test1(): Unit ={
    val a = 1
    val b = 2
    println(a,b)
  }

  def read(): Unit ={
    println("lalala....")
  }
}
