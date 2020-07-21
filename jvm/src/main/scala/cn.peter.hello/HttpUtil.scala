package cn.peter.hello
object HttpUtil{
  import java.net.InetAddress

  def isReachable(host: String): Boolean = {
    val a = InetAddress.getByName(host);
    a.isReachable(1000)
  }

  def func(): Unit ={
    println("null")
  }
}