Feature: Login Test
  Scenario: Login with valid credentials
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User should be directed to the dashboard page

  Scenario: Login with locked-out user
    Given User open the web sauce demo
    When User input "locked_out_user" as userName and "secret_sauce" as password and click login
    And system gives pop up message "Epic sadface: Sorry, this user has been locked out."
    Then User should not be directed to the dashboard page


    Scenario: Login with 1 step
      Given User login with valid username "standart_user" and password "secret_sauce"