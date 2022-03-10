package google.selectors;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 *
 * @author Versus-PC
 */
public class S_Google extends PageObject {

    public S_Google() {
        super();
    }
    
    @FindBy(xpath="//input[@class='gLFyf gsfi']") public WebElementFacade inputSearch;
    @FindBy (xpath="(//input[@name='btnK'])[2]") public WebElementFacade buttonSearch;
    @FindBy (xpath="(//h3[text()='Automatización - Wikipedia, la enciclopedia libre']") public WebElementFacade wikipediaLink;
    
}