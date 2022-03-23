Feature: WebOrder Test

   @Test1
  Scenario: Verify  User Valid Login 
    Given user start launch
    When user insert username and password
    When click submit 
    Then click signout