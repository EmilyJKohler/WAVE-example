package wave.example.pages

import wave.example.pages.generic.BasePage

object WhichTaxDoYouAccessPage extends BasePage {

  val url = ""
  val header = "Which tax do you access using this account?"


  def selectTaxServiceForOrganisations(
                                      isCorporationTax: Boolean = true,
                                      isSubmitOnceComplete: Boolean = true):Unit = {

    if (isCorporationTax)
      clickById("IR-CT")

    if (isSubmitOnceComplete)
      clickContinue()
  }

}
