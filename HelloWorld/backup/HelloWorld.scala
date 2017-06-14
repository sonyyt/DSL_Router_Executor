

object HelloWorld {
  val (myVar1: Int, myVar2: String) = (40, "Foo")
  
  def main(args: Array[String]){
    println("Hello World");
    delayed(time());
    
  }
    
   def time() = {
      println("获取时间，单位为纳秒")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("在 delayed 方法内")
      println("参数： " + t)
      //t
   }
}