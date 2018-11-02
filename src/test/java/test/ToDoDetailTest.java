package test;

import base.BaseTest;
import org.junit.Test;
import page.HomePage;

public class ToDoDetailTest extends BaseTest {

    @Test
    public void openToDoListItemDetailAndClickCheckBox() {
        HomePage homePage = new HomePage(driver);

        homePage.clickAddButton()
                .writeRandomTitle()
                .writeRandomDescription()
                .clickConfirmButton()
                .clickListsElement()
                .clickCheckBox()
                .checkToDoIsMarkedAsCompleted();
    }

    @Test
    public void deletedTask() {
        HomePage homePage = new HomePage(driver);

        homePage.clickAddButton()
                .writeRandomTitle()
                .writeRandomDescription()
                .clickConfirmButton()
                .clickListsElement()
                .clickDeleteTaskButton()
                .checkToDoDeleted();
    }

    @Test
    public void editedTask() {
        HomePage homePage = new HomePage(driver);

        homePage.clickAddButton()
                .writeRandomTitle()
                .writeRandomDescription()
                .clickConfirmButton()
                .clickListsElement()
                .clickEditButton();
    }


}