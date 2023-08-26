package alltrellotestcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import trellogenericutility.TrelloBaseClass;
import trellopomrepository.ManageYourTeamsProjectsFromAnywhereTrelloPage;

public class Trello_01_trelloLoginPageAfterLogin extends TrelloBaseClass {
	@Test
	public void Login() throws Throwable {
	
		WebDriverUtils.implicitwait(driver);
		
		  if
		  (ExpectedConditions.titleContains(Tfileutils.readDataFromProprtyFile("Homepagetitle")) != null) {
		  System.out.println("The Homepagetitle is correct upon verification");
		  System.out.println("Homepage is displayed"); 
		  ManageYourTeamsProjectsFromAnywhereTrelloPage homepage = new ManageYourTeamsProjectsFromAnywhereTrelloPage(
					driver);
			homepage.getLoginLink().click();
			if (ExpectedConditions.titleContains(Tfileutils.readDataFromProprtyFile("loginpagetitle")) != null) {
				System.out.println("The Login To trello page title is correct upon verification");
				System.out.println("The Login To trello page is displayed");
				if (ExpectedConditions.urlMatches(Tfileutils.readDataFromProprtyFile("loginpageurl")) != null) {
					System.out.println("The Login To trello page URL is correct upon verification");
					System.out.println("The Login To trello page is displayed");
				} else {
					System.out.println("The Login To trello page URL is incorrect upon verification");
					System.out.println("The Login To trello page is not displayed");
				}
			} else {
				System.out.println("The Login To trello page title is incorrect upon verification");
				System.out.println("The Login To trello page is not displayed");
			}
		  }else {
		  System.out.println("The Homepagetitle is incorrect upon verification");
		  System.out.println("Homepage is not displayed"); }

	}
}
