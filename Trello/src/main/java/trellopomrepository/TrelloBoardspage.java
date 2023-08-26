package trellopomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardspage {
WebDriver driver;
public TrelloBoardspage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}


@FindBy(xpath = "//button[@data-testid='header-create-menu-button']")
private WebElement createButton;

@FindBy(xpath = "//button[@data-testid='header-create-board-button']")
private WebElement createBoardSection;

@FindBy(xpath = "//input[@type='text']")
private WebElement boardTtileTextField;

@FindBy(xpath = "//button[@data-testid='create-board-submit-button']")
private WebElement createOptionButton;

@FindBy(xpath = "//h1[@class='js-board-editing-target board-header-btn-text']")
private WebElement createdBoardName;

@FindBy(xpath = "//div[contains(@class,'board-menu-tab-content')]")
private List<WebElement> menuOption;

@FindBy(xpath = "//div[contains(@class,'board-menu-tab-content')]")
private WebElement menuSection;

@FindBy(xpath = "//a[contains(@class,'open-more')]")
private WebElement moreOption;

@FindBy(xpath = "//a[contains(@class,'js-close-board')]")
private WebElement closeBoardOption;

@FindBy(xpath = "//div[@class=\"pop-over-content js-pop-over-content u-fancy-scrollbar js-tab-parent\"]")
private WebElement closeBoardSection;

@FindBy(xpath = "//input[@class='js-confirm full nch-button nch-button--danger']")
private WebElement closeButton;

@FindBy(xpath = "//a[@class='pop-over-header-close-btn icon-sm icon-close']")
private WebElement cancelButton;

@FindBy(xpath = "//div[@class='sq6Il9of3PCOgi']")
private WebElement closeSection;

@FindBy(xpath = "//button[text()='Reopen board']")
private WebElement reOpenBoardButton;

@FindBy(xpath = "//button[text()='Permanently delete board']")
private WebElement permanentlyDeleteBoardLink;

@FindBy(xpath = "//section[@class='rX4pAv5sWHFNjp js-react-root']")
private WebElement deleteBoardSection;

@FindBy(xpath = "//button[text()='Delete']")
private WebElement deleteButton;

@FindBy(xpath = "//textarea[text()='To Do']")
private WebElement defaultToDoList;

@FindBy(xpath = "//textarea[text()='Doing']")
private WebElement defaultDoingList;

@FindBy(xpath = "//textarea[text()='Done']")
private WebElement defaultDoneList;

@FindBy( xpath = "//a[@aria-label='List actions']")
private WebElement listActions;

@FindBy(xpath = "//a[@class='js-close-list']")
private WebElement archiveThisList;

@FindBy(xpath = "//a[@class='open-add-list js-open-add-list']")
private WebElement addAnotherList;

@FindBy(xpath = "//input[@class='list-name-input']")
private WebElement enterListTitleTextField;

@FindBy(xpath = "//a[@class='open-card-composer js-open-card-composer']")
private WebElement addCardTextField;

@FindBy(xpath = "//span[@class=\"list-card-title js-card-name\"]")
private WebElement addedCard;

public List<WebElement>[] getMenuOption;

public WebElement getCreateButton() {
	return createButton;
}

public WebElement getCrateBoardSection() {
	return createBoardSection;
}

public WebElement getBoardTtileTextField() {
	return boardTtileTextField;
}

public WebElement getCreateOptionButton() {
	return createOptionButton;
}

public WebElement getCreatedBoardName() {
	return createdBoardName;
}

public List<WebElement> getMenuOption() {
	return menuOption;
}

public WebElement getMenuSection() {
	return menuSection;
}

public WebElement getMoreOption() {
	return moreOption;
}

public WebElement getCloseBoardOption() {
	return closeBoardOption;
}

public WebElement getCloseBoardSection() {
	return closeBoardSection;
}

public WebElement getCloseButton() {
	return closeButton;
}

public WebElement getCancelButton() {
	return cancelButton;
}

public WebElement getCloseSection() {
	return closeSection;
}

public WebElement getReOpenBoardButton() {
	return reOpenBoardButton;
}

public WebElement getPermanentlyDeleteBoardLink() {
	return permanentlyDeleteBoardLink;
}

public WebElement getDeleteBoardSection() {
	return deleteBoardSection;
}

public WebElement getDeleteButton() {
	return deleteButton;
}

public WebElement getDefaultToDoList() {
	return defaultToDoList;
}

public WebElement getDefaultDoingList() {
	return defaultDoingList;
}

public WebElement getDefaultDoneList() {
	return defaultDoneList;
}

public WebElement getListActions() {
	return listActions;
}

public WebElement getArchiveThisList() {
	return archiveThisList;
}

public WebElement getAddAnotherList() {
	return addAnotherList;
}

public WebElement getEnterListTitleTextField() {
	return enterListTitleTextField;
}

public WebElement getAddCardTextField() {
	return addCardTextField;
}

public WebElement getAddedCard() {
	return addedCard;
}

}
