package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {

    public static AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("deviceName", "HQ64WBB49721");
        capabilities.setCapability("appPackage", "com.example.android.architecture.blueprints.todomvp");
        capabilities.setCapability("appActivity", "com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity");

        driver = new AndroidDriver<MobileElement>(capabilities);
    }

    @After
    public void End() {
        driver.quit();
    }
}