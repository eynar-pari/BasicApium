import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Eynar Pari 26/10/2018
 */
public class JunitBasicRealDevice {

    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        // set up appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Eynar");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
        capabilities.setCapability("appActivity", ".ContactManager");

         //capabilities.setCapability("avd", "Eynar"); --> Real Device no necista avd = android virtual device
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void addContact() {

        WebElement el = driver.findElement(By.xpath(".//*[@text='Add Contact']"));
        el.click();
        WebElement name = driver.findElement(By.id("com.example.android.contactmanager:id/contactNameEditText"));
        name.sendKeys("Eynar Pari");
        WebElement email = driver.findElement(By.id("com.example.android.contactmanager:id/contactEmailEditText"));
        email.sendKeys("eynar.pari@example.com");

        WebElement saveButton = driver.findElement(By.id("com.example.android.contactmanager:id/contactSaveButton"));
        saveButton.click();

    }
}
