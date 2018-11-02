package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ToDoDetailPageConstant extends BasePage {

    public By CHECK_BOX_IN_DETIL_PAGE = By.id("com.example.android.architecture.blueprints.todomvp:id/task_detail_complete");
    public By DELETE_TASK_BUTTON = By.id("com.example.android.architecture.blueprints.todomvp:id/menu_delete");
    public By EDIT_BUTTON = By.id("com.example.android.architecture.blueprints.todomvp:id/fab_edit_task");

    public ToDoDetailPageConstant(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

}