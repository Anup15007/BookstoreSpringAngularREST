package com.cg.bookstore.stepdefinition;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookstoreStepDef {
	private WebDriver driver;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\PPB\\chromedriver.exe" );
		driver=new ChromeDriver();	
	}
	@Given("User is on BookStore Login Page")
	public void user_is_on_BookStore_Login_Page() throws Throwable {
	    
	}
	@When("User enter invalid username and password$")
	public void user_enter_invalid_username_and_password() throws Throwable {
		
	}
	@Then("'Invalid Username or Password' Message should display$")
	public void invalid_Username_or_Password_Message_should_display() throws Throwable {
	    
	}
	@When("User has not entered username or password$")
	public void user_has_not_entered_username_or_password() throws Throwable {
	    
	}
	@Then("'Don't Keep the Required Fields Empty' alert message should display$")
	public void don_t_Keep_the_Required_Fields_Empty_alert_message_should_display() throws Throwable {
	    
	}
	@When("User enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
	    
	}
	@Then("User should successfully login to his Capbook account$")
	public void user_should_successfully_login_to_his_Capbook_account() throws Throwable {
	    
	}
	@Given("Admin is on BookStore Book Addition Page")
	public void admin_is_on_BookStore_Book_Addition_Page() throws Throwable {
	    
	}
	@When("Admin enter valid Book Information$")
	public void admin_enter_valid_Book_Information() throws Throwable {
	    
	}
	@Then("Admin should successfully add a book$")
	public void admin_should_successfully_add_a_book() throws Throwable {
	    
	}
	@When("Admin enter Invalid Book Information$")
	public void admin_enter_Invalid_Book_Information() throws Throwable {
	    
	}
	@Given("Admin is on BookStore Book Category Page$")
	public void admin_is_on_BookStore_Book_Category_Page() throws Throwable {
	    
	}
	@When("Admin enter valid Category Information$")
	public void admin_enter_valid_Category_Information() throws Throwable {
	    
	}
	@Then("Admin should successfully add a Category$")
	public void admin_should_successfully_add_a_Category() throws Throwable {
	    
	}
	@Given("Admin is on BookStore Category Addition Page$")
	public void admin_is_on_BookStore_Category_Addition_Page() throws Throwable {
	    
	}
	@When("Admin enter Invalid Category Information$")
	public void admin_enter_Invalid_Category_Information() throws Throwable {
	    
	}
	@Given("Admin is on BookStore Author Addition Page$")
	public void admin_is_on_BookStore_Author_Addition_Page() throws Throwable {
	    
	}
	@When("Admin enter valid Author Information$")
	public void admin_enter_valid_Author_Information() throws Throwable {
	    
	}
	@Then("Admin should successfully add a Author$")
	public void admin_should_successfully_add_a_Author() throws Throwable {
	    
	}
	@When("Admin enter Invalid Author Information$")
	public void admin_enter_Invalid_Author_Information() throws Throwable {
	    
	}
	@Given("User is on BookStore Registration Page$")
	public void user_is_on_BookStore_Registration_Page() throws Throwable {
	    
	}
	@When("User enter valid Information$")
	public void user_enter_valid_Information() throws Throwable {
	    
	}
	@Then("User should successfully register on bookstore$")
	public void user_should_successfully_register_on_bookstore() throws Throwable {
	    
	}
}
