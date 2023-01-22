package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredCapabilities(String udid, String platformVersion) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("appPackage", "com.android.contacts");
        desiredCapabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");
        return desiredCapabilities;
    }
}


