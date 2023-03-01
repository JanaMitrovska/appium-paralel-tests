package screens;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;

public class EditContactPage extends BaseScreen {

    public EditContactPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    /**Mobile Elements*/
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Simpson']")
    @iOSXCUITFindBy(accessibility = "Last name")
    MobileElement modifiedLastName;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='More options']")
    @iOSXCUITFindBy(accessibility = "Edit")
    MobileElement moreOptionsButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Delete Contact']")
    MobileElement deleteButton;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Delete Contact']")
    MobileElement confirmDeleteButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Last name']")
    @iOSXCUITFindBy(accessibility = "Last name")
    MobileElement lastName;

    @AndroidFindBy(id = "com.android.contacts:id/menu_edit")
    @iOSXCUITFindBy(accessibility = "Edit")
    MobileElement editButton;

    @AndroidFindBy(id = "com.android.contacts:id/editor_menu_save_button")
    @iOSXCUITFindBy(accessibility = "Done")
    MobileElement saveBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Lisa Gibson']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Lisa Gibson']")
    MobileElement contact;

    /**Actions*/
    public void modifyLastName() {
        modifiedLastName.clear();
        sendKey(lastName, "Gibson");
    }

    public void clickEditButton() { waitAndClick(editButton);}
    public void clickMoreOptionsButton() { waitAndClick(moreOptionsButton);}
    public void clickDeleteButton() {
        scrollDown();
        waitAndClick(deleteButton);
    }
    public void clickConfirmDeleteButton() { waitAndClick(confirmDeleteButton);}
    public void clickSaveBtn(){ waitAndClick(saveBtn);}

    public void clickContact(){ waitAndClick(contact);}

    public void scrollDown(){
        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_Y = (int) (dimension.height * 1);
        int end_x = (int) (dimension.width * 0.5);
        int end_Y = (int) (dimension.height * 0);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(start_x,start_Y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_Y)).release().perform();
    }

}
