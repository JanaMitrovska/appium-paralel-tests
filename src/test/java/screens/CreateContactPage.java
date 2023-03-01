package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CreateContactPage extends BaseScreen {

    public CreateContactPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    /**Mobile Elements*/
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='First name']")
    @iOSXCUITFindBy(accessibility = "First name")
    MobileElement firstName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Last name']")
    @iOSXCUITFindBy(accessibility = "Last name")
    MobileElement lastName;

    @AndroidFindBy(id = "com.android.contacts:id/editor_menu_save_button")
    @iOSXCUITFindBy(accessibility = "Done")
    MobileElement saveBtn;



    /**Actions*/
    public void enterName() {
        sendKey(firstName, "Lisa");
    }
    
    public void enterLastName() {
        sendKey(lastName, "Simpson");
    }

    public void clickSaveBtn(){ waitAndClick(saveBtn);}
}
