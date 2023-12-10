package org.setpdefinition.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.Base.BaseClase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pojo.pojoSignInpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Productlisting extends BaseClase{
	
	@Given("User lauch the browser and Maximize the Window")
	public void user_lauch_the_browser_and_Maximize_the_Window() throws Exception {
		driver = launchBrowser("chrome");
	}

	@When("User to hit the ShopDot URL")
	public void user_to_hit_the_ShopDot_URL() {
		launchurl("https://qa2.shopdotapp.com/login");
	}

	@When("User login to the ShopDot Application")
	public void user_login_to_the_ShopDot_Application() {
		pojoSignInpage g = new pojoSignInpage(driver);
	    sendText(g.getEmail(), "joshva13@yopmail.com");
	    sendText(g.getPassword(), "Welcome6@123");
	    clickBtn(g.getLogin());
	    
//	    try {
//
//			WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
//           // Attempt to click the element
//           element.click();
//           
//       } catch (Exception e) {
//           // Handle the exception, e.g., wait for the overlay to disappear or use JavaScript to click
//       	WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Settings']"));
//
//       	   
//           JavascriptExecutor executor = (JavascriptExecutor) driver;
//           executor.executeScript("arguments[0].click();", element);
// 
//	}
}

	@When("User clicks on the products button")
	public void user_clicks_on_the_products_button() throws InterruptedException {
		Thread.sleep(1500);
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Products']"));
		// Perform an action causing the page to refresh or update
		element = driver.findElement(By.xpath("//a[normalize-space()='Products']")); // Re-find the element
		element.click(); // Perform the action again

//	    driver.findElement(By.xpath("//a[normalize-space()='Products']")).click();
	}

	@When("Displays the Products Listing Screen")
	public void displays_the_Products_Listing_Screen() {
		String dis = driver.findElement(By.xpath("//h1[normalize-space()='Products']")).getText();
		Assert.assertEquals(dis, "Products");
	    System.out.println("The page is displaying in: " + dis + "Listing Page");
	    
	    String text = driver.findElement(By.xpath("//div[contains(@class,'indicator_text')]")).getText();
	    System.out.println(text);
	    
	}
	
//001
	@When("Brand clicks on Products Listing menu")
	public void brand_clicks_on_Products_Listing_menu() {
		driver.findElement(By.xpath("//a[normalize-space()='Products']")).click();
		String no = driver.findElement(By.xpath("//div[@class='number']")).getText();
	    Assert.assertEquals(no, false);
	    System.out.println("No of Products is: " + no);
	}

////	@Then("the products from the E-Commerce website \\(i.e., Shopify) that are initially synced will be listed")
////	public void the_products_from_the_E_Commerce_website_i_e_Shopify_that_are_initially_synced_will_be_listed() {
////		String no = driver.findElement(By.xpath("//div[@class='number']")).getText();
////	    Assert.assertEquals(no, false);
////	    System.out.println("No of Products is: " + no);
//	}
	
	
//	002
	@When("user selects the Tags")
	public void user_selects_the_Tags() throws InterruptedException, AWTException {
		Thread.sleep(1000);
	    //	    -- if already added
	    driver.findElement(By.xpath("//p[@class='value_added cursor-pointer']")).click(); 
	    
//	    if fresh 
//	    driver.findElement(By.xpath("//p[@class='add-item-label add-tags cursor-pointer']")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Tag name']")).sendKeys("unisex");
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//input[@placeholder='Tag name']")).sendKeys("child");
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Save Changes']")).click();
	}
	

	@When("displays sucessful message")
	public void displays_sucessful_message() throws InterruptedException {
		Thread.sleep(2000);
	    String pop = driver.findElement(By.xpath("//div[contains(text(),'Product tag updated successfully')]")).getText();
	    System.out.println(pop);
	}

	@When("user selects Category")
	public void user_selects_Category() throws InterruptedException {
		Thread.sleep(3000);

		//	    for fresh
//		driver.findElement(By.xpath("//p[@class='add-item-label add-category cursor-pointer']")).click();

		//		for exiting
		driver.findElement(By.xpath("//p[normalize-space()='Men']")).click();
//		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@id='Men']//div[@class='checkbox-text']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Accessories')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Ties & Pocket Squares')]")).click();
		
		driver.findElement(By.xpath("//button[@class='button button-orange-dark']")).click();
	}

	@When("again displays sucessful message")
	public void again_displays_sucessful_message() throws InterruptedException {
		Thread.sleep(1500);
	    String popup = driver.findElement(By.xpath("//div[@id='1']")).getText();
	    System.out.println(popup);
	}

	@When("the status button become enable")
	public void the_status_button_become_enable() {
	    boolean enabled = driver.findElement(By.xpath("//span[@class='off']")).isEnabled();
	    System.out.println(enabled);
	}

	@When("the user click on the Inactive button")
	public void the_user_click_on_the_Inactive_button() {
	    driver.findElement(By.xpath("//span[@class='off']")).click();
	}

	@Then("congratulation Pop up displays")
	public void congratulation_Pop_up_displays() {
	    String con = driver.findElement(By.xpath("//h1[normalize-space()='Congratulations!']")).getText();
	    Assert.assertEquals(con, "Congratulations!");
	    System.out.println(con);
	    String textc = driver.findElement(By.xpath("//p[@class='mb-4']")).getText();
	    System.out.println(textc);
	    
	    driver.findElement(By.xpath("//img[@alt='close']")).click();
	}

	@Then("the Inactive changes to Active status")
	public void the_Inactive_changes_to_Active_status() {
	    String act = driver.findElement(By.xpath("//span[@class='on']")).getText();
	    System.out.println(act);
	}

}
