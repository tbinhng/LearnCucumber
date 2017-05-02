Feature: Login Gugu99 Bank

  As a registed user
  I want to login into guru99 bank

  Scenario: Login with correct information
    Given I am on Login page
    When I enter username and password
#    When I enter "<username>" and "<password>"
    Then I see the login successful page

#    |username|password|
#    |mngr76381|yhYvYtU|