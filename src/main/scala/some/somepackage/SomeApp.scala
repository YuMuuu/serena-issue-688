package some.somepackage

object SomeApp {
  case class Config(field1: String)

  def someMethod(config: Config): Unit = {
    val str = config.field1 + config.field1

    println(str)
  }
}