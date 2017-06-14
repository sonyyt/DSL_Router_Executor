

object Timer {
  def oncePerSecond(callback: ()=> Unit){
    while(true){
      callback();
      Thread sleep 1000;
    }
  }
  
  def timeFlies(){
    println("how time flies");
  }
  
  
  def main(args: Array[String]){
    oncePerSecond(timeFlies);
  }
}