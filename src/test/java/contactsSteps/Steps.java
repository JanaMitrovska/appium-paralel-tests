package contactsSteps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Steps {
    public CreateContactSteps createContactSteps;
    public Steps (AndroidDriver<MobileElement> driver){
        this.createContactSteps = new CreateContactSteps(driver);
    }
}
