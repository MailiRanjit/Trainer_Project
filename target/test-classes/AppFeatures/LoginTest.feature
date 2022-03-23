Feature: Test Login
@Test1
  Scenario: Verify  User Valid Login 
    Given user start home page
    When user insert username and password
    Then click submit 
    