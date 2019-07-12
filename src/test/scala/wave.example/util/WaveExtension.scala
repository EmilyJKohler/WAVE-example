package wave.example.util

import java.awt.event.{InputEvent, KeyEvent}
import java.awt.{MouseInfo, Rectangle, Robot, Toolkit}

import org.openqa.selenium.By
import wave.example.pages.generic.BasePage

object WaveExtension extends BasePage {

  val url = ""
  val header = ""


  def clickWave() {

    val robot = new Robot()



    driver.manage().window().maximize()
    Thread.sleep(1000)
    robot.mouseMove(5, 50)
    robot.mousePress(InputEvent.BUTTON1_MASK)
    robot.mouseRelease(InputEvent.BUTTON1_MASK)
    robot.delay(1000)

    robot.keyPress(KeyEvent.VK_META)
    robot.keyPress(KeyEvent.VK_SHIFT)
    robot.keyPress(KeyEvent.VK_U)
    robot.delay(1000)

    robot.keyRelease(KeyEvent.VK_META)
    robot.keyRelease(KeyEvent.VK_SHIFT)
    robot.keyRelease(KeyEvent.VK_U)

  }

  def checkErrors() {
    driver.switchTo().frame("wave_sidebar_container")
    val errorNumber = driver.findElements(By.cssSelector("span")).get(0).getText
    println("Number of errors on this page = " + errorNumber)
    errorNumber.toInt shouldBe 0
  }

  def checkAlerts() {
    val alertNumber = driver.findElements(By.cssSelector("span")).get(1).getText
    println("Number of alerts on this page = " + alertNumber)
    alertNumber.toInt shouldBe 0
  }
}