package contactsSteps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.*;

public class BaseSteps {
    protected ContactsPage contactsPage;
    public BaseSteps(AndroidDriver<MobileElement> driver) {
        contactsPage = new ContactsPage(driver);
    }
}
