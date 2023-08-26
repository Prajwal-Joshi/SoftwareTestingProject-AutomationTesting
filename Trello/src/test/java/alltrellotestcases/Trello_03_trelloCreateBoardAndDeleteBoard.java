package alltrellotestcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import trellogenericutility.TrelloBaseClass;
import trellopomrepository.LoginToTrelloPage;
import trellopomrepository.LogintoContinuepage;
import trellopomrepository.ManageYourTeamsProjectsFromAnywhereTrelloPage;
import trellopomrepository.TrelloBoardspage;

public class Trello_03_trelloCreateBoardAndDeleteBoard extends TrelloBaseClass {
	@Test
public void createAndDeleteBoard() throws Throwable {
	WebDriverUtils.implicitwait(driver);	
	ManageYourTeamsProjectsFromAnywhereTrelloPage homepage= new ManageYourTeamsProjectsFromAnywhereTrelloPage(driver);
	homepage.getLoginLink().click();
	LoginToTrelloPage loginpage=new LoginToTrelloPage(driver);
	driver.switchTo().activeElement().sendKeys(Tfileutils.readDataFromProprtyFile("email"),Keys.ENTER);
	LogintoContinuepage loginContinuePage=new LogintoContinuepage(driver);
	Thread.sleep(4000);
	driver.switchTo().activeElement().sendKeys(Tfileutils.readDataFromProprtyFile("password"),Keys.ENTER);
	Thread.sleep(4000);
	TrelloBoardspage boardsPage=new TrelloBoardspage(driver);
	boardsPage.getCreateButton().click();
	if (boardsPage.getCrateBoardSection().isDisplayed()) {
		System.out.println("Create board section is visible");
          boardsPage.getCrateBoardSection().click();
		driver.switchTo().activeElement().sendKeys(Tfileutils.readDataFromProprtyFile("boardname1"));
		if (boardsPage.getCreateOptionButton().isEnabled()) {
			System.out.println("Create Button is enabled");
			boardsPage.getCreateOptionButton().click();
			if (WebDriverUtils.checkForUrlShouldContains(driver, Tfileutils.readDataFromProprtyFile("boardsprofilehomepageurl"))) {
				System.out.println("URL contains with the Crated board name and it is correct  upon verification");
				if (WebDriverUtils.checkTitleContains(driver, Tfileutils.readDataFromProprtyFile("boardname1"))) {
					System.out.println("Title contains with the Crated board name and it is correct  upon verification");
					if (boardsPage.getCreatedBoardName().isDisplayed()) {
						System.out.println("Board is displayed");
							boardsPage.getMenuOption().get(0).click();
							 	if(boardsPage.getMoreOption().isDisplayed()) {
							 		System.out.println("More Option is visible");
							 		boardsPage.getMoreOption().click();
							 		if (boardsPage.getCloseBoardOption().isDisplayed()) {
										System.out.println("CloseBoardOption is visible");
										boardsPage.getCloseBoardOption().click();
										if (boardsPage.getCloseBoardSection().isDisplayed()) {
											System.out.println("CloseBoardSection is displayed");
											boardsPage.getCloseButton().click();
											if (boardsPage.getCloseSection().isDisplayed()) {
												System.out.println("CloseSection is displayed");
											}
											else {
												System.out.println("CloseSection is not displayed");
												boardsPage.getPermanentlyDeleteBoardLink().click();
												if (boardsPage.getDeleteBoardSection().isDisplayed()) {
													System.out.println("DeleteBoardSection is visible");
													boardsPage.getDeleteButton().click();
												}
												else {
													System.out.println("DeleteBoardSection is not visible");
												}
											}
										} else {
											System.out.println("CloseBoardSection is not displayed");
										}
									}else {
										System.out.println("CloseBoardOption is not visible");
									}
							 	}else {
							 		System.out.println("More Option is not visible");
								}
				}else {
					System.out.println("Board is not displayed");
				}
					}
			else {
				System.out.println("Title does not contains with the Crated board name and it is incorrect  upon verification");
				System.out.println("Board is displayed");
			}
				}else {
				System.out.println("URL does not contains with the Crated board name and it is incorrect  upon verification");
				System.out.println("Board is not displayed");
			}
		} else {
			System.out.println("Create Button is disabled");
		}
		
	}else {
		System.out.println("Create board section is not visible");

	}
	}
}
