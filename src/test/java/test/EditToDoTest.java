package test;

import base.BaseTest;
import org.junit.Test;
import page.HomePage;

public class EditToDoTest extends BaseTest {

    @Test
    public void editToDoListItem() {
        HomePage homePage = new HomePage(driver);

        homePage.clickListsElement()
                .clickEditButton()
                .clickTitle()
                .clickDesc()
                .clickConfirmButton();
    }

}