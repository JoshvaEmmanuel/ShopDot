package org.setpdefinition.Pages;


import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import javax.swing.Action;

import org.Base.BaseClase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.pojoSignInpage;

import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Brandprofile extends BaseClase{
	public Faker faker;
	public Robot r;
	pojoSignInpage j;
	
	@Given("user Launch the browser and Maximize window")
	public void user_Launch_the_browser_and_Maximize_window() throws Exception {
	   r= new Robot();
	   launchBrowser("chrome");
	    windowMax();
	}

	@When("to hit the Shopdot Url")
	public void to_hit_the_Shopdot_Url() throws InterruptedException {
	    launchurl("https://qa2.shopdotapp.com/login");
	   
	}

	@When("user Login to the shopdot")
	public void user_Login_to_the_shopdot() throws InterruptedException {
		
		pojoSignInpage j =new pojoSignInpage(driver);
		sendText(j.getEmail(), "testsample17@yopmail.com");
		sendText(j.getPassword(), "Welcome6@123");
		clickBtn(j.getLogin());
		
		Thread.sleep(6000);
		Actions a = new Actions(driver);
		System.out.println("get the url is: " + driver.getCurrentUrl());
//if (driver.getCurrentUrl().equalsIgnoreCase("https://qa2.shopdotapp.com/dashboard")) {
//	System.out.println("first");
//	a.moveToElement(driver.findElement(By.xpath("(//span[@class='icon'])[2]"))).build().perform();
//	System.out.println("second");
//	driver.findElement(By.xpath("//a[normalize-space()='Settings']")).click();
//}
//else {
//	driver.findElement(By.xpath("")).click();
//}
	}

//	@When("user navigated to the onboarding")
//	public void user_navigated_to_the_dashbord() throws InterruptedException {
//		
//	    System.out.println("navigated");
//	}

//	@When("user clicks on Brand Profile menu from Settings")
//	public void user_clicks_on_Brand_Profile_menu_from_Settings() throws InterruptedException {
//		Thread.sleep(7000);
//	    driver.findElement(By.xpath("//a[@class='sc-fqkvVR EmAIz ob-link'][normalize-space()='Settings']"));
//	}

	@When("Display brand profile page")
	public void display_brand_profile_page() throws InterruptedException {
		
		String text = driver.findElement(By.xpath("//h1[normalize-space()='Brand Profile']")).getText();
		assertEquals(text, "Brand Profile");
		System.out.println("Displaying screen: " + text);
		
	    }
	
	@When("user click on the Save button without enter any data on the mandatory field")
	public void user_click_on_the_Save_button_without_enter_any_data_on_the_mandatory_field() throws InterruptedException {
		
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript("window.scroll(0,1000)");
		
		WebElement scroll = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		scroll.click();
		
	}



	@Then("user should see the validation error message on the each field")
	public void user_should_see_the_validation_error_message_on_the_each_field() throws IOException {
	    screenShot("error");
	    
	    String error = driver.findElement(By.xpath("//span[normalize-space()='Company name is required.']")).getText();
	    assertEquals(error, "Company name is required.");
	    System.out.println(error);
	    
	    String error1 = driver.findElement(By.xpath("//span[normalize-space()='Contact email is required.']")).getText();
	    assertEquals(error1, "Contact email is required.");
	    System.out.println(error1);
	    
	    String error2 = driver.findElement(By.xpath("//span[@class='invalid-feedback']")).getText();
	    assertEquals(error2, "Brand logo is required."); 
	    System.out.println(error2);
	    
	    String error3 = driver.findElement(By.xpath("//span[normalize-space()='Brand name is required.']")).getText();
	    assertEquals(error3, "Brand name is required.");
	    System.out.println(error3);
	    
	    String error4 = driver.findElement(By.xpath("//span[contains(text(),'Brand website is required. (https://www.example.co')]")).getText();
	    assertEquals(error4, "Brand website is required. (https://www.example.com)");
	    System.out.println(error4);
	    
	    String error5 = driver.findElement(By.xpath("//span[normalize-space()='Select max 3 categories.']")).getText();
	    assertEquals(error5, "Select max 3 categories.");
	    System.out.println(error5);
	    
	    String error6 = driver.findElement(By.xpath("//span[normalize-space()='About the brand is required.']")).getText();
	    assertEquals(error6, "About the brand is required.");
	    System.out.println(error6);
	    
	}
//02
	@When("user enter company name on the Company name field")
	public void user_enter_company_name_on_the_Company_name_field() throws InterruptedException {
		faker=new Faker();
//	    driver.findElement(By.xpath("//input[@name='company_name']")).sendKeys("testsample2");

	    typeText("testsample2", driver.findElement(By.xpath("//input[@name='company_name']")));
	}

	@When("user enter email on the Contact email field")
	public void user_enter_email_on_the_Contact_email_field() throws InterruptedException {
//	   driver.findElement(By.xpath("//input[@name='company_email_address']")).sendKeys("testsample2@yopmail.com");
	   typeText("testsample2@yopmail.com", driver.findElement(By.xpath("//input[@name='company_email_address']")));
	}

	@When("user enter phone numer in the Contact phone number field")
	public void user_enter_phone_numer_in_the_Contact_phone_number_field() throws InterruptedException {
//	    driver.findElement(By.xpath("//input[@placeholder='123-456-6587']")).sendKeys("1231231230");
		typeText(faker.phoneNumber().phoneNumber(), driver.findElement(By.xpath("//input[@placeholder='123-456-6587']")));
	}
	
	@When("user upload the logo in the Upload logo field")
	public void user_upload_the_logo_in_the_Upload_logo_field() throws InterruptedException, AWTException, IOException {
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/Emman/Downloads/download (5).jpeg");
   
	}
	@When("user enter brand name in the Brand name filed")
	public void user_enter_brand_name_in_the_Brand_name_filed() throws InterruptedException {
		
//	    driver.findElement(By.xpath("//input[@name='store_name']")).sendKeys("Test001");
	    typeText("Test001", driver.findElement(By.xpath("//input[@name='store_name']")));
	}

	@When("user enter website in the Brand website field")
	public void user_enter_website_in_the_Brand_website_field() {
//	    driver.findElement(By.xpath("//input[@placeholder='janebeautyparlor.com']")).sendKeys("test.com");
	    typeText("test.com", driver.findElement(By.xpath("//input[@placeholder='janebeautyparlor.com']")));
	}

	@When("user selects three Brand category from the Brand category field")
	public void user_selects_three_Brand_category_from_the_Brand_category_field() throws InterruptedException {

		driver.findElement(By.xpath("(//input[@name='brand_categories'])[1]"));
//		selectMultiplecheckBox(driver.findElement(By.xpath("(//input[@name='brand_categories'])[1]")));
//        selectMultiplecheckBox(driver.findElement(By.xpath("(//input[@name='brand_categories'])[2]")));
//	    selectMultiplecheckBox(driver.findElement(By.xpath("(//input[@name='brand_categories'])[3]")));


	}
	

	@When("user selects Brand values from the Brand values field")
	public void user_selects_Brand_values_from_the_Brand_values_field() {
	    driver.findElement(By.xpath("(//div[@class='checkbox-text'])[14]")).click();
	}

	@When("user enters data in the About the brand field box")
	public void user_enters_data_in_the_About_the_brand_field_box() {
//	    driver.findElement(By.xpath("//textarea[@name='brand_story']")).sendKeys("testing");
	    typeText("testing", driver.findElement(By.xpath("//textarea[@name='brand_story']")));
	}

	@When("user enters link in the Add a Youtube or Vimeo video link field")
	public void user_enters_link_in_the_Add_a_Youtube_or_Vimeo_video_link_field() {
	    driver.findElement(By.xpath("//input[@name='brand_promo']")).sendKeys("https://www.youtube.com");
	    typeText("https://www.youtube.com", driver.findElement(By.xpath("//input[@name='brand_promo']")));
	    
	}

	@When("user click on the Save button")
	public void user_click_on_the_Save_button() {
	    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	}
	
	@When("User is automatically moved to the next page, which is Prefernces Page")
	public void user_is_automatically_moved_to_the_next_page_which_is_Prefernces_Page() {
		String gettext = driver.findElement(By.xpath("//h1[@class='m-0']")).getText();
	    assertEquals(gettext, "Preferences");
	    System.out.println("Displaying page is: " + gettext);
	}

	@Then("user should see the Sucessful message")
	public void user_should_see_the_Sucessful_message() throws IOException {
		
	    screenShot("sucessful msg");
	    
    assertEquals(driver.findElement(By.xpath("(//div[@class='Toastify__toast-body']/child::div)[2]")).getText(), "Your changes have been saved.");
	    
	}

	@When("user enter the emailid {string} in Contact email Field")
	public void userEnterTheEmailidInContactEmailField(String arg0) {
		driver.findElement(By.xpath("//input[@name='company_email_address']")).sendKeys("Test@&^");

	}
	@Then("user should see the error message {string} below the fields")
	public void userShouldSeeTheErrorMessageBelowTheFields(String arg0) {
		String er = driver.findElement(By.xpath("//span[@class='error-text']")).getText();


	}


}
