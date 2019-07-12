package wave.example.stepdefs

import wave.example.pages._
import wave.example.stepdefs.generic.BaseSteps
import wave.example.util.WaveExtension

class WaveStepDefs extends BaseSteps {

  Given("""^I navigate to the GOVUK home page$""") { () =>
    GovUkPage.navigateTo()
  }

  Given("""I navigate to the Reset your password page"""){ () =>
    GovUkPage.navigateTo()
    GovUkPage.forgottenPassword
  }

  Given("""^I navigate to the You need to reset your password page$""") { () =>
    GovUkPage.navigateTo()
    GovUkPage.forgottenPassword
    ResetYouPasswordPage.forgotUserId
  }

  Given("""^I navigate to the What type of account do you have\? page$""") { () =>
    GovUkPage.navigateTo()
    GovUkPage.forgottenPassword
    ResetYouPasswordPage.forgotUserId
    YouNeedToResetYourPasswordPage.returnToHMRC
  }

  Given("""^I am a Tax Organisation on the password reset journey$""") { () =>
    GovUkPage.navigateTo()
    GovUkPage.forgottenPassword
    ResetYouPasswordPage.forgotUserId
    YouNeedToResetYourPasswordPage.returnToHMRC
  }

  When("""^I navigate to the What type of account do you have\? page and select Organisation$""") {
    ChooseAccountTypePage.fillInPage(isOrganisation = true)
  }

  When("""^I select Corporation Tax$""") { () =>
    WhichTaxDoYouAccessPage.selectTaxServiceForOrganisations(isCorporationTax = true)
  }


  And("""^I enter my known facts for Corporation Tax in the incorrect format: "(.*)"$""") { (knownFacts: String) =>
    IdentifiersAndVerifiersForCorporationTaxPage.fillInPage(knownFacts)
  }



    //Wave extension:

  And("""^I click on the Wave extension for the HTML report$"""){ () =>
    WaveExtension.clickWave()
  }

  Then("""I should see no errors for this page""") { () =>
    WaveExtension.checkErrors()
    WaveExtension.checkAlerts()
  }
}