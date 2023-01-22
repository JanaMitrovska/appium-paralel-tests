package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ContactsPage extends BaseScreen {

    public ContactsPage (AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**Mobile Elements*/
    By plusButton  = By.id("com.android.contacts:id/floating_action_button");
    By firstName = By.xpath("//android.widget.EditText[@text='First name']");
    By lastName = By.xpath("//android.widget.EditText[@text='Last name']");
    By saveBtn = By.id("com.android.contacts:id/editor_menu_save_button");

    /**Actions*/
    public void clickAddContactButton() {
        waitAndClick(plusButton);
    }

    public void enterName() {
        sendKey(firstName, "Lisa");
        sendKey(lastName, "Simpson");
    }

    public void clickSaveBtn(){
        waitAndClick(saveBtn);
    }


}
