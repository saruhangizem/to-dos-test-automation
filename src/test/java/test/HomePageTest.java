package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void homePage() {
        HomePage homePage = new HomePage(driver);
        boolean isAllItemsExist = homePage.checkAllItems();

        Assert.assertTrue("Anasayfa üzerindeki tüm elementler görüntülenemedi.", isAllItemsExist);
    }

}