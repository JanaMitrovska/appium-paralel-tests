package contactsSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import screens.*;

public class BaseSteps {
    protected ContactsPage contactsPage;
    public BaseSteps(AppiumDriver<MobileElement> driver) {
        contactsPage = new ContactsPage(driver);
    }
}
