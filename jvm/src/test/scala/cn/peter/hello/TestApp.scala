package cn.peter.hello

class TestApp {
  def main(args: Array[String]): Unit = {

  }

  def testCat(): Unit = {
    println("cat")
  }

  def testDemo(): Unit = {
    println("demo")
  }

  def testIsReachable(): Unit = {
    println(HttpUtil.isReachable("127.0.0.1"))
  }

  def testClock(): Unit = {
    val s = System.nanoTime()
    var num = 0
    for (elem <- (0 until 10000)) {
      num += elem
    }
    println(s"time = ${System.nanoTime() - s}")
  }
}
