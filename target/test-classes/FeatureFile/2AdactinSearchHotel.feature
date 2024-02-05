Feature: To validate search hotel page functionality
Scenario: User enter the valid value
Given User enter valid information
When user enter username and password
And User click login button
Then User see nextpage text Welcome to adactin group of Hotels
When User Select Loc,HotelRoom,NumofRoom,Adultperroom,Childperroom,Checkin and Checkout
And  user click search box
Then user see the next page

Scenario outline: To validate search page using different set of credential
Given User enter the valid information
When user enter username and password
And User click login button
Then User see nextpage text Welcome to adactin group of Hotels
When User Select Loc<location>,HotelRoom<hotel>,NumofRoom<noofrooms>,Adultperroom<adultperroom>,Childperroom<childrenperroom>,Checkin<checkindate> and Checkout<checkoutdate>
And  user click search box
Then user see the next page based on credential type"<credential Type>"
Examples:
Location|hotel|roomtype|numberofrooms|checkindate|checkoutdate|adultperperson|childperroom|credential Type|

