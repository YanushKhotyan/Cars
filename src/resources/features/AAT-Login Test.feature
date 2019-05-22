Feature: AAT - Login feature
  - User try to login

  @Test
  @AcceptanceTest
  Scenario: Login test
    Given a user with correct data present
    When the user login to system
    Then home page is available

  @Test
  @AcceptanceTest
  Scenario: Get list of all cars
    When a user search for information about some cars