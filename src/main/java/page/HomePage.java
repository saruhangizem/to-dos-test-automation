package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import util.HomePageConstant;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePage extends HomePageConstant {

    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public boolean checkAllItems() {
        List<Boolean> isAllItemsExist = new ArrayList<Boolean>();
        isAllItemsExist.add(isExist(ADD_BUTTON, 10));
        isAllItemsExist.add(isExist(LIST_ELEMENT, 10));
        isAllItemsExist.add(isExist(FILTER_LABEL, 10));
        isAllItemsExist.add(isExist(MENU_FILTER, 10));
        isAllItemsExist.add(isExist(CHECKBOX, 10));

        return !isAllItemsExist.contains(false);
    }

    public NewToDoPage clickAddButton() {

        WebElement addButton = waitAndFindElement(ADD_BUTTON);

        try {
            addButton.click();
            TouchAction touchAction = new TouchAction(driver);
            touchAction.tap(ElementOption.element(addButton));
        } catch (Exception ex) {
        }

        return new NewToDoPage(driver);
    }

    public ToDoDetailPage clickListsElement() {

        List<MobileElement> list = waitAndFindElements(TO_DO_LIST);
        list.get(0).click();

        return new ToDoDetailPage(driver);
    }

    public void checkToDoCreated() {
        List<MobileElement> list = waitAndFindElements(TO_DO_LIST);

        assertEquals(list.size(), 3);
    }

    public void checkToDoDeleted() {
        List<MobileElement> list = waitAndFindElements(TO_DO_LIST);

        assertEquals(list.size(), 2);
    }

}