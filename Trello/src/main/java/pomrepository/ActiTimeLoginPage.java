package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
WebDriver driver;
public ActiTimeLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="username")
private WebElement userNameTextField;

@FindBy(name = "pwd")
private WebElement passwordTextField;

@FindBy(id = "keepLoggedInCheckBox")
private WebElement keepLoggedInCheckBox;

@FindBy(id = "loginButton")
private WebElement loginButton;

 public WebElement getLoginButton() {
	return loginButton;
}

WebElement getKeepLoggedInCheckBox() {
	return keepLoggedInCheckBox;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

 public WebElement getUserNameTextField() {
	return userNameTextField;
}

}
