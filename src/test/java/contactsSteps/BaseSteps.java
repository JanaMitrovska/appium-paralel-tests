package contactsSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import screens.*;

public class BaseSteps {
    protected CreateContactPage createContactPage;
    protected ContactsListPage contactsListPage;
    protected EditContactPage editContactPage;
    public BaseSteps(AppiumDriver<MobileElement> driver) {
        createContactPage = new CreateContactPage(driver);
        contactsListPage = new ContactsListPage(driver);
        editContactPage = new EditContactPage(driver);
    }
}
