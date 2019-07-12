package wave.example.pages

import wave.example.pages.generic.BasePage

object ResetYouPasswordPage extends BasePage {

  val url = ""
  val header = "Reset your password"


  def forgotUserId = clickById("forgot-userId")

}
