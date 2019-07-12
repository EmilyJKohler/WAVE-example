package wave.example.utils

import org.openqa.selenium.WebDriver
import org.scalatest.Matchers
import wave.example.utils.JvmOptions._

trait Driver extends Matchers {

  implicit val driver: WebDriver = SingletonDriver.getInstance().getOrElse(throw new ExceptionInInitializerError())

  private val environment = Environment(env)

  val host: String = environment.url

  if (shutdown) sys.addShutdownHook {
    driver.quit()
  }
}

private object JvmOptions {

  def getProperty(property: String) = Option(System.getProperty(property))

  val env: String = getProperty("env").getOrElse("local")

  val shutdown: Boolean = getProperty("shutdown").getOrElse("true") match {
    case "true" => true
    case "false" => false
    case _ => throw new IllegalArgumentException(s"##########  Not a Boolean  ##########")
  }

}
