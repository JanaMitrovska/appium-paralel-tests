package contactsSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ContactSteps extends BaseSteps{

    public ContactSteps(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ContactSteps createContactSteps() {
        contactsPage.clickAddContactButton();
        contactsPage.enterName();
        contactsPage.enterLastName();
        contactsPage.clickSaveBtn();
        return this;
    }

    public ContactSteps editContactSteps(){
        contactsPage.clickContact();
        contactsPage.clickEditButton();
        contactsPage.modifyLastName();
        contactsPage.clickSaveBtn();
        return this;
    }

    public ContactSteps searchForContactSteps(){
        contactsPage.clickSearchButton();
        contactsPage.enterSearchName();
        return this;
    }

    public ContactSteps deleteContactSteps(){
        contactsPage.clickContact();
        contactsPage.clickMoreOptionsButton();
        contactsPage.clickDeleteButton();
        contactsPage.clickConfirmDeleteButton();
        return this;
    }

}
