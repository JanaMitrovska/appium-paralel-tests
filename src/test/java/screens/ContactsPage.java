package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

import java.time.Duration;

public class ContactsPage extends BaseScreen {

    public ContactsPage (AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    /**Mobile Elements*/
    /*
    By plusButton  = By.id("com.android.contacts:id/floating_action_button");
    By firstName = By.xpath("//android.widget.EditText[@text='First name']");
    By lastName = By.xpath("//android.widget.EditText[@text='Last name']");
    By saveBtn = By.id("com.android.contacts:id/editor_menu_save_button");
     */

    @AndroidFindBy(id = "com.android.contacts:id/floating_action_button")
    @iOSXCUITFindBy(accessibility = "Add")
    MobileElement plusButton;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='First name']")
    @iOSXCUITFindBy(accessibility = "First name")
    MobileElement firstName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Last name']")
    @iOSXCUITFindBy(accessibility = "Last name")
    MobileElement lastName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Simpson']")
    @iOSXCUITFindBy(accessibility = "Last name")
    MobileElement modifiedLastName;

    @AndroidFindBy(id = "com.android.contacts:id/editor_menu_save_button")
    @iOSXCUITFindBy(accessibility = "Done")
    MobileElement saveBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Lisa Simpson']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Lisa Simpson']")
    MobileElement contact;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='More options']")
    @iOSXCUITFindBy(accessibility = "Edit")
    MobileElement moreOptionsButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Delete Contact']")
    MobileElement deleteButton;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Delete Contact']")
    MobileElement confirmDeleteButton;


    @AndroidFindBy(id = "com.android.contacts:id/menu_search")
    @iOSXCUITFindBy(accessibility = "Search")
    MobileElement searchButton;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "Search")
    MobileElement searchField;

    @AndroidFindBy(id = "com.android.contacts:id/menu_edit")
    @iOSXCUITFindBy(accessibility = "Edit")
    MobileElement editButton;



    /**Actions*/
    public void clickAddContactButton() {
        waitAndClick(plusButton);
    }

    public void enterName() {
        sendKey(firstName, "Lisa");
    }
    
    public void enterLastName() {
        sendKey(lastName, "Simpson");
    }

    public void modifyLastName() {
        modifiedLastName.clear();
        sendKey(lastName, "Gibson");
    }


    public void contactIsDisplayed(){
        waitAndFindElement(contact);
    }

    public void clickSaveBtn(){
        waitAndClick(saveBtn);
        goBack();
    }

    public void clickContact() {waitAndClick(contact);}

    public void clickMoreOptionsButton() {waitAndClick(moreOptionsButton);}

    public void clickDeleteButton() {waitAndClick(deleteButton);}

    public void clickConfirmDeleteButton() {
        waitAndClick(confirmDeleteButton);
        goBack();
    }

    public void clickSearchButton() {waitAndClick(searchButton);}

    public void enterSearchName() {sendKey(searchField,"Lisa Simpson");}

    public void clickEditButton() {waitAndClick(editButton);}
}
