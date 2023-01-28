package contactsSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Steps {
    public ContactSteps createContactSteps;
    public Steps (AppiumDriver<MobileElement> driver){
        this.createContactSteps = new ContactSteps(driver);
    }
}
