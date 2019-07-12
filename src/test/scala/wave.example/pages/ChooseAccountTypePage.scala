package wave.example.pages

import wave.example.pages.generic.BasePage

object ChooseAccountTypePage extends BasePage {

  val url = ""
  val header = "What type of account do you have?"

  val orgRadioButtonID = "Organisation"

  def fillInPage(isOrganisation: Boolean = true,
                 submitOnceComplete: Boolean = true):Unit = {

    if (isOrganisation)
      clickById(orgRadioButtonID)
    if (submitOnceComplete)
      clickContinue()
  }
}
