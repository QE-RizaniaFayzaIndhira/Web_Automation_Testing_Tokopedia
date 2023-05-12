Feature: As a user i want to login so that i can see my home page

  Background:
    Given user on home page
    And user click login
    And user on login page

    Scenario: As a user i success login with input valid email and valid password
      When user input valid email
      And user click next button
      And user input valid password
      And user click login button
      And user on home page successfully