
@login
Feature: Validating Search of Hotel
Background: 
    Given User launch  Adactin webpage
    When User enter username and password
      | vaithy2410 | vaithy@2410 |
      | vaithy2410 | vaithy@2411 |
    And Userclick loginbutton
    Then User see error message for the invalid login

  Scenario: To validate the data in Search hotel webpage
    When User enter Location,Hotels,RoomType,NumberofRooms,CheckInDate,CheckOutDate,AdultsperRoom,ChildrenperRoom
      | Sydney | Hotel Creek | Double | 2 - Two |
    And user enter the check in date and check out date
      | 21/09/2023 | 23/09/2023 |
    And user enter the adults per room,childrens per room
      | 2 - Two | 2 - Two |
    And user click search button
    Then user see the message next page of the select page
