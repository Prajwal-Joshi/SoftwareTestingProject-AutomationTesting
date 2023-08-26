package check;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import pomrepository.ActiTimeLoginPage;

public class EndToEnd extends BaseClass{
	@Test
public void login() throws Throwable {
		webdriverutils.implicitwait(driver);
		ActiTimeLoginPage loginPage=new ActiTimeLoginPage(driver);
		WebElement username=loginPage.getUserNameTextField();
		username.sendKeys(fileutils.readDataFromProprtyFile("username"));
		WebElement password =loginPage.getPasswordTextField();
		password.sendKeys(fileutils.readDataFromProprtyFile("password"));
		WebElement loginButton = loginPage.getLoginButton();
		loginButton.click();
}
}
