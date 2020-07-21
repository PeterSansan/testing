package cn.peter.hello

class Application {
  val name: String = "app" + System.currentTimeMillis()
  def getName: String ={
    name
  }
}

object Application{

}
