package google.stepsDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import google.steps.GooglePage;

public class SD_Google {
	@Steps
    GooglePage googlePage;
	public WebDriver driver;

    public SD_Google() {

    }

    @Before
    public void configureDriver() {
    	System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.google.com");
    }

    @Given("user is on google page")
    public void goToGoogleUrl() throws InterruptedException {
       googlePage.getDriver().get("https://www.google.es/");
    }
    
    @When("search information about automation")
    public void searchAutomation () throws InterruptedException {
       googlePage.searchInfo();
    }
    
    @And("click on a wikipedia result link")
    public void goToWikipedia() throws InterruptedException {
    	googlePage.goToWikipedia();
    }
    
    @Then("do a screenshot")
    public void doScreenshot() throws InterruptedException, IOException {
    	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));
    }
}
