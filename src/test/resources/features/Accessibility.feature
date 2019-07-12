@RunAll
Feature: Example Feature

  Scenario: Testing WAVE on GOVUK home page
    Given I navigate to the GOVUK home page
    And I click on the Wave extension for the HTML report
    Then I should see no errors for this page

  Scenario: Testing WAVE on "Reset your password" page
    Given I navigate to the Reset your password page
    And I click on the Wave extension for the HTML report
    Then I should see no errors for this page

  Scenario: Testing WAVE on "You need to reset your password" page
    Given I navigate to the You need to reset your password page
    And I click on the Wave extension for the HTML report
    Then I should see no errors for this page

  Scenario: Testing WAVE on organisations "Which type of account do you have?" page
    Given I navigate to the What type of account do you have? page
    And I click on the Wave extension for the HTML report
    Then I should see no errors for this page

  Scenario: Testing WAVE on organisations "Which tax do you access?" page
    Given I am a Tax Organisation on the password reset journey
    When I navigate to the What type of account do you have? page and select Organisation
    And I click on the Wave extension for the HTML report
    Then I should see no errors for this page

  Scenario: Testing WAVE on organisations "Enter your tax details" page
    Given I am a Tax Organisation on the password reset journey
    When I navigate to the What type of account do you have? page and select Organisation
    And I select Corporation Tax
    And I click on the Wave extension for the HTML report
    Then I should see no errors for this page

  Scenario: Testing WAVE on error message from inputting data in the incorrect format
    Given I am a Tax Organisation on the password reset journey
    When I navigate to the What type of account do you have? page and select Organisation
    And I select Corporation Tax
    And I enter my known facts for Corporation Tax in the incorrect format: "qwerty,1111111,'\'\"
    And I click on the Wave extension for the HTML report
    Then I should see no errors for this page