package cn.peter.hello

class TestApp {
  def main(args: Array[String]): Unit = {

  }

  def testCat(): Unit ={
    println("cat")
  }

  def testDemo(): Unit ={
    println("demo")
  }

  def testIsReachable(): Unit ={
    println(HttpUtil.isReachable("127.0.0.1"))
  }
}
