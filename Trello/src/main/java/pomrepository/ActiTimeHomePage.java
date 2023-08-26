package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomePage {
	public WebDriver driver;
public ActiTimeHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}
