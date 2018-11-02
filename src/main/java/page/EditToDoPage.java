package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import util.EditToDoPageConstant;

public class EditToDoPage extends EditToDoPageConstant {

    public EditToDoPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public EditToDoPage clickTitle() {
        WebElement title = waitAndFindElement(TITLE_IN_EDIT_PAGE);
        title.sendKeys(getRandomText(10));

        return this;
    }

    public EditToDoPage clickDesc() {
        WebElement description = waitAndFindElement(DESC_IN_EDIT_PAGE);
        description.sendKeys(getRandomText(20));

        return this;
    }

    public HomePage clickConfirmButton() {
        WebElement confirmButton = waitAndFindElement(CONFIRM_BUTTON_IN_EDIT_PAGE);
        confirmButton.click();

        return new HomePage(driver);
    }
}