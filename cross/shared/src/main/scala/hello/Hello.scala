package hello

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    println("Args: " + args.mkString(", "))
    println("Environment: " + sys.env.get("FOO"))
  }
}
