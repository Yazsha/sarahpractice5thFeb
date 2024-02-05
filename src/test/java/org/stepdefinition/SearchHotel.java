package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHotel extends UtilityClass {
	
	
	public static PojoClass p;
	

	@Given("User enter valid information")
	public void user_enter_valid_information() {
		System.out.println("Enter the valid information");
	    
	}
	

	@When("User Select Loc,HotelRoom,NumofRoom,Adultperroom,Childperroom,Checkin and Checkout")
	public void user_select_loc_hotel_room_numof_room_adultperroom_childperroom_checkin_and_checkout() {
		p = new PojoClass();
		selByTxt(p.getHotelLoc(), "London");
		
		selByVal(p.getHotelsname(),"Hotel Sunshine");
		
		selByVal(p.getRoomtype(), "Double");
	
		selByVal(p.getNoOfRooms(), "3 - Three");
		
		


	}
	@When("user click search box")
	public void user_click_search_box() {
		p = new PojoClass();
	clickElement(p.getSearch());
	   
	}
	@Then("user see the next page")
	public void user_see_the_next_page() {
		System.out.println("Can see next page");
	    
	}




}





