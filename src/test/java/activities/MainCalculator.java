package activities;

import control.Button;
import org.openqa.selenium.By;

public class MainCalculator {

    public Button button1;
    public Button button3;
    public Button addButton;
    public Button equalButton;

    public MainCalculator() {
        button1 = new Button(By.id("com.android.calculator2:id/digit_1"));
        button3 = new Button(By.id("com.android.calculator2:id/digit_3"));
        addButton = new Button(By.id("com.android.calculator2:id/op_add"));
        equalButton = new Button(By.id("com.android.calculator2:id/eq"));
    }
}
