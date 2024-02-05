Feature: To validate Adactin login Page

  Background: 
    Given User launch  Adactin webpage

  Scenario: To validate Adactin login using invalid data
    When User enter username and password
      | vaithy2410 | vaithy@2410 |
      | vaithy2410 | vaithy@2411 |
    And Userclick loginbutton
    Then User see error message for the invalid login
