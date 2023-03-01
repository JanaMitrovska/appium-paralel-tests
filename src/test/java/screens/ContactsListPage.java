package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ContactsListPage extends BaseScreen{

    public ContactsListPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    /**Mobile Elements*/
    @AndroidFindBy(id = "com.android.contacts:id/floating_action_button")
    @iOSXCUITFindBy(accessibility = "Add")
    MobileElement plusButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Lisa Simpson']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Lisa Simpson']")
    MobileElement contact;

    @AndroidFindBy(id = "com.android.contacts:id/menu_search")
    @iOSXCUITFindBy(accessibility = "Search")
    MobileElement searchButton;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "Search")
    MobileElement searchField;

    /**Actions*/
    public void clickContact() {waitAndClick(contact);}

    public void clickSearchButton() {waitAndClick(searchButton);}

    public void enterSearchName() {sendKey(searchField,"Lisa Simpson");}

    public void clickAddContactButton() {
        waitAndClick(plusButton);
    }

}
