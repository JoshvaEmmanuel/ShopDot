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
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class ConnectedRetailer extends BaseClase {
    public PropertiesReader propertiyReader =null ;
    public Faker faker;
    public  static Logger log;
    public String typechare;
    public List<WebElement> afterSearchRetailerList;
    public ConnectedRetailer(){
        log= LogManager.getLogger(ConnectedRetailer.class);
        propertiyReader=new PropertiesReader();
        faker=new Faker();
    }
    @When("Brand clicks on {string} option from Retailers menu")
    public void brand_clicks_on_option_from_Retailers_menu(String ConnectedRetailers) {
        mouseHoverToElement(driver.findElement(By.xpath("//a[normalize-space()='Retailers']")));
        waituntilClickable(driver.findElement(By.xpath("//a[normalize-space()='Connected Retailers']")));
    }

    @Then("the list of approved retailers is displayed in alphabetical order by Retailer Name")
    public void the_list_of_approved_retailers_is_displayed_in_alphabetical_order_by_Retailer_Name() throws IOException, InterruptedException {
        screenShot("alp");
    }

    @And("the total number of connected retailers for that brand is displayed on the top next to Connected Retailers")
    public void theTotalNumberOfConnectedRetailersForThatBrandIsDisplayedOnTheTopNextToConnectedRetailers() throws InterruptedException {
        Thread.sleep(3000);
        String text = driver.findElement(By.xpath("//h1[normalize-space()='Connected Retailers']")).getText();
        log.info(text);
        String text1 = driver.findElement(By.xpath("//div[@class='number']")).getText();
        log.info(text1);
    }

    @When("user enters characters in the search bar")
    public void userEntersCharactersInTheSearchBar() {

        List<WebElement> retailerList = driver.findElements(By.xpath("//div[@class='store']"));
        typechare = retailerList.get(generateRandomNumber(0, retailerList.size()-1)).getText().substring(0, 3);
        log.info("Entering the Keyword Randomly in the Connected Retailer : " + typechare );
        typeText(typechare,driver.findElement(By.xpath("//input[@type='text']")));

    }

    @And("the Application displays only those approved retailers that match the search keyword")
    public void theApplicationDisplaysOnlyThoseApprovedRetailersThatMatchTheSearchKeyword() throws InterruptedException {
        afterSearchRetailerList = driver.findElements(By.xpath("//div[@class='store']"));
        String retailerName = afterSearchRetailerList.get(generateRandomNumber(0, afterSearchRetailerList.size()-1)).getText();
        log.info("The Retailer displayed the char that match the search word : " + retailerName);
        Assert.assertTrue(retailerName.toLowerCase().contains(typechare.toLowerCase()));

    }

    @And("the Application displays the result count")
    public void theApplicationDisplaysTheResultCount() {
     Assert.assertEquals(Integer.parseInt( driver.findElement(By.xpath("//div[@class='number']")).getText().trim()),afterSearchRetailerList.size());



    }

    @When("Brand selects retailer category as filter")
    public void brandSelectsRetailerCategoryAsFilter() {
        driver.findElement(By.xpath("//div[@data-selectid='relailerCategory']")).click();
    }

    @When("Brand selects state as filter")
    public void brandSelectsStateAsFilter() {
        clickBtn(driver.findElement(By.xpath("//div[@data-selectid='states']")));
    }

    @When("Brand clicks on Approved Retailers option from Retailers menu")
    public void brandClicksOnApprovedRetailersOptionFromRetailersMenu() {
        
    }

    @And("the Application verifies that there are no approved retailers for that Brand")
    public void theApplicationVerifiesThatThereAreNoApprovedRetailersForThatBrand() {
        
    }

    @Then("the following screen will be displayed: {string}")
    public void theFollowingScreenWillBeDisplayed(String arg0) {
    }
}
