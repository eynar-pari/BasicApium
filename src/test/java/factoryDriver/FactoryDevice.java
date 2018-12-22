package factoryDriver;

import org.openqa.selenium.WebDriver;

public class FactoryDevice {

    public static WebDriver make (String type){

        IDevice device;
        switch (type.toLowerCase()){
            case "android":
                device= new Android();
                break;
            case "ios":
                device= new Ios();
                break;
            case "windowsphone":
                device =new WindowsPhone();
                break;
            default:
                device = new Android();
                break;
        }
        return  device.create();
    }

}
