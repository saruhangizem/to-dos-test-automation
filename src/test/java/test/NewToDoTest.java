package test;

import base.BaseTest;
import org.junit.Test;
import page.HomePage;


public class NewToDoTest extends BaseTest {

    @Test
    public void createToDoListItem() {
        HomePage homePage = new HomePage(driver);

        homePage.clickAddButton()
                .writeRandomTitle()
                .writeRandomDescription()
                .clickConfirmButton();

        homePage.checkToDoCreated();
    }

}