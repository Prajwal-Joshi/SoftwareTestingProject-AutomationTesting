package trellogenericutility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TrelloBaseClass {
	public WebDriver driver;
	public TFileUtility Tfileutils= new TFileUtility();
	public TrelloWebDriverUtility WebDriverUtils=new TrelloWebDriverUtility();
	
	
	@BeforeMethod
	public void configBrforeMethod() throws Throwable {
		ChromeOptions chrop= new ChromeOptions();
		chrop.addArguments("--remote-allow-origins=*");
		String browser= Tfileutils.readDataFromProprtyFile("browsername");
		if (browser.equals("chrome")) {
			driver=new ChromeDriver(chrop);
		}
		else if (browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(Tfileutils.readDataFromProprtyFile("url"));
		
	}
	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
