package cn.peter.hello

class Flower(val name:String) {
  val time: Long = System.currentTimeMillis()
  def bloom(): Unit ={
    if (time%2==1){
      println(s"$name 开花了")
    } else{
      println(s"$name 不开花")
    }
  }
}
