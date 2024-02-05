Feature: To validate continue functionality
Scenario:To validate continue using select a hotel
Given user launch Adatin application
Given User enter valid information
When user enter username and password
And User click login button
Then User see nextpage text Welcome to adactin group of Hotels
When User Select Loc,HotelRoom,NumofRoom,Adultperroom,Childperroom,Checkin and Checkout
And  user click search box
Then user see the next page of the select
When User select the hotel 
Then Once user selected the hotel user click continue button
And User the next page of Book A Hotel



