package wave.example.pages

import wave.example.pages.generic.BasePage

object GovUkPage extends BasePage {

  val url = "www.tax.service.gov.uk/gg/sign-in"
  val header = "HMRC services: sign in or register"



  def forgottenPassword = clickById("forgotten-password")


}
