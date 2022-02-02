Feature: Student Registration Form

  As a user on https://toolqa.com/
  I want to be able to register on the website
  So that I can practice automation.


    Scenario: Valid registration
    Given user navigates to the website
    And user clicks on Demo Site button
    And user clicks on the Forms
    And user clicks on Practice form button
    And user enters first name "Aghate"
    And user enters last name "Nono"
    And user enters email address "nagathe2000@yahoo.fr"
    And user selects gender option
    And user enters mobile number "07886763223"
    And user selects hobbies
    And user enters address "Nottingham"
    And user selects state
    And user selects city

    When user clicks on the Submit button
    Then the form is submitted successfully
    And user clicks on the close button

