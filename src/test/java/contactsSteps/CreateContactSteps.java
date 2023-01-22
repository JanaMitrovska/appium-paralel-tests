package contactsSteps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CreateContactSteps extends BaseSteps{

    public CreateContactSteps(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public CreateContactSteps createContactSteps() {
        contactsPage.clickAddContactButton();
        contactsPage.enterName();
        contactsPage.clickSaveBtn();
        return this;
    }


}
