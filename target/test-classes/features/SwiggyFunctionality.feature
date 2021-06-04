@Search
Feature: Singup functionality in swiggy website

  @Sanity
  Scenario: Provide the signUp functions to swiggy users
    Given The user is on the swiggy home page
    When User click on SignUp
    Then User should be redirected to SignUp page

  @Sanity
  Scenario Outline: Provide the SignUp functions to swiggy user
    Given The user is on the swiggy SignUp page
    When User enters "<PhoneNumber>""<Name>""<Email>" and "<Password>"
    Then User should be able to SignUp

    Examples: 
      | PhoneNumber | Name | Email          | Password |
      |  8888888888 | user | user@gmail.com | abc123   |
