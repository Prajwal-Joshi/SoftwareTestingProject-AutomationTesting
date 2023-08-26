package trellopomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogintoContinuepage {
WebDriver driver;
public LogintoContinuepage(WebDriver driver) {
	this.driver=driver;
}

@FindBy(id = "password")
private WebElement passwordTextField;

public WebElement PasswordTextField() {
	return passwordTextField;
}

@FindBy(css ="button[id='login-submit']")

private WebElement loginButton;
public WebElement getLoginButton() {
	return loginButton;
}

}
