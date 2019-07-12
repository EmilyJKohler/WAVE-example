package wave.example.pages.generic

import org.openqa.selenium.By
import wave.example.utils.{Driver, Messages}
import org.scalatest.{Assertion, Matchers}
import org.scalatest.selenium.WebBrowser


object BasePage extends BasePage {
  val url = "DEFAULT"
  val header = "DEFAULT"
}

trait BasePage extends WebBrowser with Matchers with Driver with Messages {

  val header: String
  val url: String

  def on(): Assertion = {
    currentUrl should include(url)
    find(cssSelector("h1")).get.text shouldBe header
  }

  def navigateTo(): Unit = go to s"$host/$url"

  def find(by: By) = driver.findElement(by)
  def findById(id: String) = find(By.id(id))
  def findByName(id: String) = driver.findElements(By.name(id))
  def findByClass(className: String) = driver.findElements(By.className(className))
  def findByCSS(css: String) = driver.findElement(By.cssSelector(css))

  def clickById(id: String) = findById(id).click()
  def clickByName(id: String, num: Int) = findByName(id).get(num).click()
  def clickByClass(id: String, num: Int) = findByClass(id).get(num).click()

  def sendKeysById(id: String, value: String) = {
    findById(id).clear()
    findById(id).sendKeys(value)
  }

  def clickContinue(continueId: String = "submit-continue") = {
    clickById(continueId)
  }

  def ShutdownTest() = driver.quit()

}
