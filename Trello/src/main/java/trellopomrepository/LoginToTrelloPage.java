	package trellopomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToTrelloPage {
WebDriver driver;
public LoginToTrelloPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath = "//input[@id='user']")
private WebElement emailTextField;

@FindBy(xpath = "//input[@id='login']")
private WebElement continueButton;

public WebElement getContinueButton() {
	return continueButton;
}
public WebElement getEmailTextField() {
	return emailTextField;
}

}
