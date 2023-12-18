package org.setpdefinition.Pages;

import Utils.PropertiesReader;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Base.BaseClase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class requestforAccess extends BaseClase {
    public PropertiesReader propertiyReader =null ;
    public Faker faker;
    public  static Logger log;
    public requestforAccess(){
        log= LogManager.getLogger(requestforAccess.class);
        propertiyReader=new PropertiesReader();
        faker=new Faker();
    }

    @And("user Login to the SHOPDOT application")
    public void userLoginToTheSHOPDOTApplication() {
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(propertiyReader.getProperty("requestforAccess_User"));
        driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Welcome6@123");
        driver.findElement(By.xpath("//div[@class='form-input mt-5']")).click();
    }
    @And("the retailer clicks on {string} under Retailers main menu")
    public void theRetailerClicksOnUnderRetailersMainMenu(String arg0) {

        mouseHoverToElement(driver.findElement(By.xpath("//a[normalize-space()='Retailers']")));
       waituntilClickable(driver.findElement(By.xpath("//a[normalize-space()='Requests for Access']")));

    }

    @Then("the Application displays the list of retailers requesting access from the brand")
    public void theApplicationDisplaysTheListOfRetailersRequestingAccessFromTheBrand() throws InterruptedException {
        Thread.sleep(6000);
        WebElement requesacess = driver.findElement(By.xpath("//h1[normalize-space()='Requests for Access']"));
        assertEquals(requesacess.getText(), "Requests for Access");
        log.info("The Displayed scree is : " + requesacess.getText());

        WebElement total = driver.findElement(By.xpath("//div[@class='number']"));
        log.info("The total no of Brands is : " + total.getText());
    }

    @And("the sorting order is Pending requests followed by Connected requests and then Declined requests")
    public void theSortingOrderIsPendingRequestsFollowedByConnectedRequestsAndThenDeclinedRequests() throws IOException {
//        driver.findElement(By.xpath(""));
        screenShot("BP");
    }


    @And("the retailer clicks on the View or Edit button from {int}dot menu")
    public void theRetailerClicksOnTheViewOrEditButtonFromDotMenu(int arg0) {
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > img:nth-child(1)")).click();

    }

    @Then("it should navigate to the Retailer profile screen")
    public void itShouldNavigateToTheRetailerProfileScreen() {
        String currentUrl = driver.getCurrentUrl();
        if(driver.getCurrentUrl().contains("https://qa2.shopdotapp.com/brand/retailer-profile/76")){
            log.info("The displaying screen is Brands Profile : " + currentUrl);
        }
    }


    @And("retailer clicks on the Retailer Profile")
    public void retailerClicksOnTheRetailerProfile() {
       retryClick(driver.findElement(By.xpath("//a[normalize-space()='TejasRetailer1']")));
    }

    @And("it redirect to the retailer profile screen")
    public void itRedirectToTheRetailerProfileScreen() throws InterruptedException {
        Thread.sleep(2000);
        driver.getCurrentUrl();

        String brandName = driver.findElement(By.cssSelector("div[class='title'] h1")).getText();
        log.info(brandName);

    }

    @And("Retailer clicks on the Approve Button without assign any product")
    public void retailerClicksOnTheApproveButtonWithoutAssignAnyProduct() {
        driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();

    }

    @Then("it should display the error message {string}")
    public void itShouldDisplayTheErrorMessage(String message) throws InterruptedException {
        Thread.sleep(1500);
        String popup = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText();
        assertEquals(popup,message);
        log.info("The displayed error test is : " + popup);
    }

    @When("Brand clicks on Decline button from Retailer Profile Screen")
    public void brandClicksOnDeclineButtonFromRetailerProfileScreen() {
        driver.findElement(By.xpath("//a[normalize-space()='emmanueljThree']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Decline']")).click();
    }

    @Then("a confirmation message is display {string}")
    public void aConfirmationMessageIsDisplay(String DeclineError) {
        String declinepopup = driver.findElement(By.xpath("//div[@class='popup_content']")).getText();
        log.info("note:" +declinepopup);
        assertEquals(declinepopup, DeclineError);
    }

    @When("Brand clicks on {string} from the pop-up")
    public void brandClicksOnFromThePopUp(String yes) {
        waituntilClickable(driver.findElement(By.xpath("//button[normalize-space()='Yes']")));
    }

    @Then("the brand-retailer connection request’s status is updated from {string} to {string}")
    public void theBrandRetailerConnectionRequestSStatusIsUpdatedFromTo(String Pending, String Declined) {
        String pending = driver.findElement(By.xpath("//span[@class='status-pill w-auto false pill_pending false']")).getText();
        log.info("The Before Status is: " + pending);
        String decline = driver.findElement(By.xpath("//span[@class='status-pill w-auto false pill_pending false']")).getText();
        log.info("The After Status is: " + decline);
    }

    @And("a success message is displayed on the screen: {string}")
    public void aSuccessMessageIsDisplayedOnTheScreen(String arg0) {
    }

    @When("user clicks on {string} link from one of the Approved retailers")
    public void userClicksOnLinkFromOneOfTheApprovedRetailers(String View) {
        driver.findElement(By.xpath("")).click();
    }

    @Then("the Retailer Profile Screen is displayed with an option to Decline")
    public void theRetailerProfileScreenIsDisplayedWithAnOptionToDecline() {
        boolean displayed = driver.findElement(By.xpath("//button[normalize-space()='Decline']")).isDisplayed();
        log.info(displayed);
        String declineenabled = driver.findElement(By.xpath("//button[normalize-space()='Decline']")).getText();
        log.info(declineenabled);
//        driver.findElement(By.xpath("//button[normalize-space()='Decline']")).click();
    }

    @When("user clicks on Decline")
    public void userClicksOnDecline() {
        driver.findElement(By.xpath("//button[normalize-space()='Decline']")).click();
    }

    @Then("a pop-up is displayed with the message: {string}")
    public void aPopUpIsDisplayedWithTheMessage(String poperror) {
        String declinerror = driver.findElement(By.xpath("//div[@class='popup_content']")).getText();
        assertEquals(declinerror, poperror);
        log.info(declinerror);

    }

    @Then("the retailer connection status is updated from {string} to {string}")
    public void theRetailerConnectionStatusIsUpdatedFromTo(String arg0, String arg1) {
        String connect = driver.findElement(By.xpath("//span[@class='status-pill w-auto pill_connected false false']")).getText();
        log.info(connect);
    }

    @And("all previously assigned products are unassigned")
    public void allPreviouslyAssignedProductsAreUnassigned() throws IOException {
        screenShot("assignpro");
    }

    @And("a message is displayed on the screen: {string}")
    public void aMessageIsDisplayedOnTheScreen(String arg0) throws IOException {
        screenShot("mess");
    }

}

