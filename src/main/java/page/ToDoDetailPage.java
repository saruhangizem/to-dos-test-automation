package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import util.ToDoDetailPageConstant;

public class ToDoDetailPage extends ToDoDetailPageConstant {

    public ToDoDetailPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ToDoDetailPage clickCheckBox() {
        WebElement checkBoxInDetailPage = waitAndFindElement(CHECK_BOX_IN_DETIL_PAGE);

        try {
            checkBoxInDetailPage.click();
            driver.tap(1, checkBoxInDetailPage, 1000);
        } catch (Exception ex) {
        }

        return this;
    }

    public HomePage clickDeleteTaskButton() {
        WebElement deleteTaskButton = waitAndFindElement(DELETE_TASK_BUTTON);
        deleteTaskButton.click();

        return new HomePage(driver);
    }

    public EditToDoPage clickEditButton() {
        WebElement editButton = waitAndFindElement(EDIT_BUTTON);
        editButton.click();

        return new EditToDoPage(driver);
    }

    public void checkToDoIsMarkedAsCompleted() {
        WebElement checkBox = waitAndFindElement(CHECK_BOX_IN_DETIL_PAGE);
        Assert.assertTrue(checkBox.isSelected());
    }

}