package wave.example.pages

import wave.example.pages.generic.BasePage

object YouNeedToResetYourPasswordPage extends BasePage {

  val url = ""
  val header = "You need to reset your password with HMRC"



  def returnToHMRC = clickById("continue")

}
