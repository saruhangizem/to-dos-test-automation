package util;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePageConstant extends BasePage {

    public By ADD_BUTTON = By.id("com.example.android.architecture.blueprints.todomvp:id/fab_add_task");
    public By TO_DO_LIST = By.id("com.example.android.architecture.blueprints.todomvp:id/tasks_list");
    public By LIST_ELEMENT = By.id("com.example.android.architecture.blueprints.todomvp:id/title");
    public By FILTER_LABEL = By.id("com.example.android.architecture.blueprints.todomvp:id/filteringLabel");
    public By MENU_FILTER = By.id("com.example.android.architecture.blueprints.todomvp:id/menu_filter");
    public By CHECKBOX = By.id("com.example.android.architecture.blueprints.todomvp:id/complete");

    public HomePageConstant(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

}