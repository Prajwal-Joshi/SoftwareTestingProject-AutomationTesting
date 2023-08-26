package alltrellotestcases;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



import trellogenericutility.TrelloBaseClass;
import trellopomrepository.LoginToTrelloPage;
import trellopomrepository.LogintoContinuepage;
import trellopomrepository.ManageYourTeamsProjectsFromAnywhereTrelloPage;
import trellopomrepository.TrelloBoardspage;




public class Trello04_trello_CreateBoardDeleteDefaultListAndDeleteBoard extends TrelloBaseClass{
	@Test
public void deleteDefaultList() throws Throwable  {
	WebDriverUtils.implicitwait(driver);
	ManageYourTeamsProjectsFromAnywhereTrelloPage homepage= new ManageYourTeamsProjectsFromAnywhereTrelloPage(driver);
	homepage.getLoginLink().click();
	LoginToTrelloPage loginPage= new LoginToTrelloPage(driver);
 driver.switchTo().activeElement().sendKeys(Tfileutils.readDataFromProprtyFile("email"),Keys.ENTER);
 LogintoContinuepage logincontinuePage=new LogintoContinuepage(driver);
 driver.switchTo().activeElement().sendKeys(Tfileutils.readDataFromProprtyFile("password"),Keys.ENTER);
 TrelloBoardspage boardsPage=new TrelloBoardspage(driver);
 boardsPage.getCreateButton().click();
 boardsPage.getCrateBoardSection().click();
 driver.switchTo().activeElement().sendKeys(Tfileutils.readDataFromProprtyFile("boardname2"));
 boardsPage.getCreateOptionButton().click();
for (List<WebElement> card : boardsPage.getMenuOption) {
	boardsPage.getListActions().click();
	 boardsPage.getArchiveThisList().click();	
}
}
}
