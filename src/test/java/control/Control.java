package control;

import managerSession.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class Control {

    private By locator;
    private WebElement control;

    public Control(By locator){
        this.locator=locator;
    }

    public WebElement findControl(){
        control =Session.getInstance().getDriver().findElement(locator);
        return control;
    }

    public void click(){
        findControl();
        control.click();
    };


}
