package google.steps;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import google.selectors.S_Google;

public class GooglePage extends S_Google {
	
    public GooglePage() {

    }

    public void searchInfo() {
        waitFor(this.inputSearch);
        this.inputSearch.clear();
        this.inputSearch.sendKeys("automatización");
        this.buttonSearch.click();
    }

    public void goToWikipedia() {
        waitFor(ExpectedConditions.elementToBeClickable(this.wikipediaLink));
        this.wikipediaLink.click();
    }
    
}
