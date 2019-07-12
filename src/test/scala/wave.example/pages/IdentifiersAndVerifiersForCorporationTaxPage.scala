package wave.example.pages

import wave.example.pages.generic.BasePage

object IdentifiersAndVerifiersForCorporationTaxPage extends BasePage{

  val url = ""
  val header = "Enter your VAT details"


def fillInPage(knownFacts: String): Unit = {

  val knownFact = knownFacts.split(",")

  sendKeysById("identifier_UTR_id", knownFact(0))
  sendKeysById("verifier_Postcode_id", knownFact(1))
  sendKeysById("verifier_CRN_id", knownFact(2))

  clickByClass("button", 0)

}

}
