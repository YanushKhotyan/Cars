Feature: AAT - Sign In feature
  - User try to login


  Scenario Outline:  Sign in with correct сredentials to OROPAY
    Given a customer try to sign in with <login> and <password>
    When the customer sing in to home page
    Then the customer currency equal null
    Examples:
      | login               | password |
      | firstTest@gmail.com | Qwe123   |