package cn.peter.hello
import scala.util.Random.nextInt
class Cat(val name:String,val age:Int) {
  val id:String = name + nextInt(100).toString
  def meow(count:Int): Unit = {
    (0 until count).foreach(i => println(s"$i: meow"))
    println(".......")
  }
}
