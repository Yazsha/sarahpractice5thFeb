package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends UtilityClass {
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement passwd;
	
	@FindBy(id="login")
	private WebElement loginbtn;
	
	
	@FindBy(id="hotels")
	private WebElement hotelsname;

	@FindBy(id="room_type")
	private WebElement roomtype;

	@FindBy(id="room_nos")
	private WebElement noOfRooms;

	@FindBy(id="datepick_in")
	private WebElement checkIn;

	@FindBy(id="datepick_out")
	private WebElement checkout;

	@FindBy(id="adult_room")
	private WebElement adultPerRoom;

	@FindBy(id="child_room")
	private WebElement childPerRoom;

	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getUname() {
		return uname;
	}
	public WebElement getPasswd() {
		return passwd;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	@FindBy(name="location")
	WebElement hotelLoc;
	
	public WebElement getHotelLoc() {
		return hotelLoc;
	}
	public WebElement getHotelsname() {
		return hotelsname;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
	
	

}
