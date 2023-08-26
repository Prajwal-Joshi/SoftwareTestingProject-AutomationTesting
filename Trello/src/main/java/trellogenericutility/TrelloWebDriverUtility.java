package trellogenericutility;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloWebDriverUtility {
	public WebDriver driver;
	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
}

	public Actions action(WebDriver driver) {
		Actions act = new Actions(driver);
		return act;
	}
	public Boolean checkTitleContains(WebDriver driver, String titleToVerify) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Boolean result = wait.until(ExpectedConditions.titleContains(titleToVerify));
		return result;
	}
	public Boolean checkForUrlShouldContains(WebDriver driver, String partOfUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Boolean result = wait.until(ExpectedConditions.urlContains(partOfUrl));
		return result;
	}
	
}

