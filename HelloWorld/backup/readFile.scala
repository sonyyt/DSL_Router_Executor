import scala.io.Source

object readFile {
  def main(args: Array[String]){
    val filename = System.getProperty("user.dir")+"/resources/nearby_temperature.serv" 
    val fileContents = Source.fromFile(filename).getLines.mkString
    println(fileContents)
  }
}