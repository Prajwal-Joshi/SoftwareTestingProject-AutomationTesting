package alltrellotestcases;

import org.openqa.selenium.Keys;

import org.testng.annotations.Test;

import trellogenericutility.TrelloBaseClass;
import trellopomrepository.LoginToTrelloPage;
import trellopomrepository.LogintoContinuepage;
import trellopomrepository.ManageYourTeamsProjectsFromAnywhereTrelloPage;

public class Trello_02_trelloBoardPageContainsProfilename extends TrelloBaseClass {
	
	@Test
	public void profileName() throws Throwable {
		WebDriverUtils.implicitwait(driver);
		 ManageYourTeamsProjectsFromAnywhereTrelloPage homepage = new ManageYourTeamsProjectsFromAnywhereTrelloPage(
					driver);
			homepage.getLoginLink().click();
			LoginToTrelloPage loginpage=new LoginToTrelloPage(driver);
			loginpage.getEmailTextField().sendKeys(Tfileutils.readDataFromProprtyFile("email"));
			loginpage.getContinueButton().click();
			LogintoContinuepage loginContinuepage=new LogintoContinuepage(driver);
			if (WebDriverUtils.checkTitleContains(driver, Tfileutils.readDataFromProprtyFile("loginpagewithatlassionpagetitle"))){
				System.out.println("The loginpagewithatlassianpage title is correct upon verification");
				System.out.println("Login with Atlassion page is displayed");
				if (WebDriverUtils.checkForUrlShouldContains(driver, Tfileutils.readDataFromProprtyFile("loginwithatlassionpageurl"))) {
					System.out.println("The loginpagewithatlassianpage URL is correct upon verification");
					System.out.println("Login with Atlassion page is displayed");
					Thread.sleep(4000);
					driver.switchTo().activeElement().sendKeys(Tfileutils.readDataFromProprtyFile("password"),Keys.ENTER);
					Thread.sleep(4000);
					//logincontinuepage.getLoginButton().click();
				
					if (WebDriverUtils.checkTitleContains(driver, Tfileutils.readDataFromProprtyFile("boardsprofilehomepagetitle"))) {
						System.out.println("The boards profile homepage title is correct upin verification");
						System.out.println("Boards Profile Home Page is displayed");
						if (WebDriverUtils.checkForUrlShouldContains(driver,Tfileutils.readDataFromProprtyFile("boardsprofilehomepageurl"))) {
							System.out.println("The boards profile homepage URL is correct upin verification");
							System.out.println("Boards Profile Home Page is displayed");
						} else {
							System.out.println("The boards profile homepage URL is incorrect upin verification");
							System.out.println("Boards Profile Home Page is not displayed");
						}
					}
					else {
						System.out.println("The boards profile homepage title is incorrect upin verification");
						System.out.println("Boards Profile Home Page is not displayed");
					}
					
				} else {
					System.out.println("The loginpagewithatlassianpage URL is incorrect upon verification");
					System.out.println("Login with Atlassion page is not displayed");
				}
			} else {
				System.out.println("The loginpagewithatlassianpage title is incorrect upon verification");
				System.out.println("Login with Atlassion page is not  displayed");
			}
		
	}


}
