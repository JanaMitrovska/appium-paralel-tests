package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredCapabilities(String udid, String platformVersion, String platformName, String deviceName) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("deviceName", deviceName);
        desiredCapabilities.setCapability("udid", udid);
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");

        if(platformName.equals("iOS")){
            desiredCapabilities.setCapability("automationName", "XCUITest");
            desiredCapabilities.setCapability("bundleId", "com.apple.MobileAddressBook");
            //desiredCapabilities.setCapability("xcodeOrgId", "jana.mitrovska@gmail.com");
            //desiredCapabilities.setCapability("xcodeSigningId", "Apple Development");
        } else if(platformName.equals("Android")){
            desiredCapabilities.setCapability("appPackage", "com.android.contacts");
            desiredCapabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        }
        return desiredCapabilities;
    }
}






