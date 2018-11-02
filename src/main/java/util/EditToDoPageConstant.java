package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class EditToDoPageConstant extends BasePage {

    public By TITLE_IN_EDIT_PAGE = By.id("com.example.android.architecture.blueprints.todomvp:id/add_task_title");
    public By DESC_IN_EDIT_PAGE = By.id("com.example.android.architecture.blueprints.todomvp:id/add_task_description");
    public By CONFIRM_BUTTON_IN_EDIT_PAGE = By.id("com.example.android.architecture.blueprints.todomvp:id/fab_edit_task_done");

    public EditToDoPageConstant(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

}