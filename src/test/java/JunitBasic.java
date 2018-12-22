import activities.MainCalculator;
import io.appium.java_client.android.AndroidElement;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Eynar Pari 26/10/2018
 */
public class JunitBasic {

    MainCalculator calculator = new MainCalculator();
    @Before
    public void setUp() throws Exception {
        // set up appium
    }

    @After
    public void tearDown() throws Exception {
      //close apium
    }

    @Test
    public void add() {

       //  Action  Objecto  DondeObjeto
        calculator.button1.click();
        calculator.addButton.click();
        calculator.button3.click();
        calculator.equalButton.click();
        //Add Assert to verify
    }
}
