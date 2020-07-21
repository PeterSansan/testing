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

  def read(): Unit ={
    println("lalala....")
  }
}
