package utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesUtil {
    public DesiredCapabilities getDesiredCapabilities(String udid, String platformVersion, String platformName, String deviceName) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("deviceName", deviceName);
        desiredCapabilities.setCapability("udid", udid);
        //desiredCapabilities.setCapability("wdaLocalPort",wda);
        desiredCapabilities.setCapability("skipUnlock", "true");
        desiredCapabilities.setCapability("noReset", "false");

        if(platformName.equals("iOS")){
            desiredCapabilities.setCapability("automationName", "XCUITest");
            desiredCapabilities.setCapability("bundleId", "com.apple.MobileAddressBook");
            desiredCapabilities.setCapability("xcodeOrgId", "jana.mitrovska@gmail.com");
            desiredCapabilities.setCapability("xcodeSigningId", "Apple Development");
            desiredCapabilities.setCapability("useNewWDA",true);
            if(deviceName.equals("iPhone 12 Pro")){
                desiredCapabilities.setCapability("wdaLocalPort", "8100");
            }else if(deviceName.equals("iPhone 14 Pro")){
                desiredCapabilities.setCapability("wdaLocalPort", "8200");
            }
        } else if(platformName.equals("Android")){
            desiredCapabilities.setCapability("appPackage", "com.android.contacts");
            desiredCapabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        }
        return desiredCapabilities;
    }
}



