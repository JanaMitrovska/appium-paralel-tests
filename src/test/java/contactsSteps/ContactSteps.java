package contactsSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ContactSteps extends BaseSteps{

    public ContactSteps(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ContactSteps createContactSteps() {
        contactsListPage.clickAddContactButton();
        createContactPage.enterName();
        createContactPage.enterLastName();
        createContactPage.clickSaveBtn();
        return this;
    }

    public ContactSteps editContactSteps(){
        contactsListPage.clickContact();
        editContactPage.clickEditButton();
        editContactPage.modifyLastName();
        editContactPage.clickSaveBtn();
        return this;
    }

    public ContactSteps searchForContactSteps(){
        contactsListPage.clickSearchButton();
        contactsListPage.enterSearchName();
        return this;
    }

    public ContactSteps deleteContactSteps(){
        editContactPage.clickContact();
        editContactPage.clickMoreOptionsButton();
        editContactPage.clickDeleteButton();
        editContactPage.clickConfirmDeleteButton();
        return this;
    }

}
