package factoryDriver;

import org.openqa.selenium.WebDriver;

interface IDevice {

    WebDriver create();
}
