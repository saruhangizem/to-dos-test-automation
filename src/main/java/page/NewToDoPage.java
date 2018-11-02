package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.xpath.operations.String;
import org.openqa.selenium.WebElement;
import util.NewToDoPageConstant;

public class NewToDoPage extends NewToDoPageConstant {

    public NewToDoPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public NewToDoPage writeRandomTitle() {
        WebElement titleTextBox = waitAndFindElement(TITLE_TEXBOX);
        titleTextBox.sendKeys(getRandomText(10));

        return this;
    }

    public NewToDoPage writeTitle(String title) {
        WebElement titleTextBox = waitAndFindElement(TITLE_TEXBOX);
        titleTextBox.sendKeys();

        return this;

    }

    public NewToDoPage writeRandomDescription() {
        WebElement descTextBox = waitAndFindElement(DESC_TEXTBOX);
        descTextBox.sendKeys(getRandomText(10));

        return this;
    }

    public NewToDoPage writeDescription(String desc) {
        WebElement descTextBox = waitAndFindElement(DESC_TEXTBOX);
        descTextBox.sendKeys();

        return this;
    }

    public HomePage clickConfirmButton() {
        WebElement confirmButton = waitAndFindElement(CONFIRM_BUTTON);
        confirmButton.click();

        return new HomePage(driver);
    }

}