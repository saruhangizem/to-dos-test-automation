package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class NewToDoPageConstant extends BasePage {

    public By TITLE_TEXBOX = By.id("com.example.android.architecture.blueprints.todomvp:id/add_task_title");
    public By DESC_TEXTBOX = By.id("com.example.android.architecture.blueprints.todomvp:id/add_task_description");
    public By CONFIRM_BUTTON = By.id("com.example.android.architecture.blueprints.todomvp:id/fab_edit_task_done");

    public NewToDoPageConstant(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

}