package genericutility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public WebDriver driver;
public FileUtility fileutils=new FileUtility();
public WebDriverUtility webdriverutils=new WebDriverUtility();


@BeforeMethod
public void configBrforeMethod() throws Throwable {
	String browser= fileutils.readDataFromProprtyFile("browsername");
	if (browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if (browser.equals("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(fileutils.readDataFromProprtyFile("url"));
}
@AfterMethod
public void configAfterMethod() {
	driver.manage().window().minimize();
	driver.quit();
}
}


