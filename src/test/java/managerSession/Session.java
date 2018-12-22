package managerSession;

import factoryDriver.FactoryDevice;
import org.openqa.selenium.WebDriver;

public class Session {
    private static Session ourInstance = null;
    private WebDriver driver;
    public static Session getInstance() {

        if (ourInstance == null)
            ourInstance = new Session();
        return ourInstance;
    }

    private Session() {
        driver = FactoryDevice.make("android");
    }

    public WebDriver getDriver(){
        return driver;
    }
}
