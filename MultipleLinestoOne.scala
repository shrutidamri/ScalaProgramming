package Chapter1_Strings

/**
  * Created by SDamri on 3/25/2018.
  */
object MultipleLinestoOne {
  def main(args: Array[String]): Unit = {
    val speech = """Four score and
                   |seven years ago
                   |our fathers""".stripMargin
     println(speech)

    println(speech.replaceAll("\n", ","))
      //.replaceAll("\n",","))

}}
