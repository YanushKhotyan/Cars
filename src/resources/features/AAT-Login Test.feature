Feature: AAT - login feature
  - User try to login

#  @Test
#  @AcceptanceTest
#  Scenario: login test
#    Given a user with correct data present
#    When the user login to system
#    Then home page is available
#
#  @Test
#  @AcceptanceTest
#  Scenario: Get list of all cars
#    When a user search for information about some cars


  Scenario Outline: login to av.by
    Given a user with data
    When the user <login> and <password> to website
    Then home page is opened
    Examples:
      | login                 | password |
      | info.yanush@gmail.com | Qwer1234 |

