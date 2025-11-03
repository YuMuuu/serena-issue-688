package some.somepackage

object Main extends App {
  val config = SomeApp.Config("config-value")

  SomeApp.someMethod(config)
}