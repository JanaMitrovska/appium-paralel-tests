package tests;

import contactsSteps.Steps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utilities.DesiredCapabilitiesUtil;
import utilities.ThreadLocalDriver;

public class BaseTest {
    public AppiumDriver<MobileElement> driver;
    private final ThreadLocalDriver threadLocalDriver = new ThreadLocalDriver();
    private final DesiredCapabilitiesUtil desiredCapabilitiesUtil = new DesiredCapabilitiesUtil();

    protected Steps steps;

    @BeforeMethod
    @Parameters({ "udid", "platformVersion", "platformName", "deviceName"})
    public void setup(String udid, String platformVersion, String platformName, String deviceName) throws IOException, InterruptedException {
        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(udid, platformVersion, platformName, deviceName);
        threadLocalDriver.setTLDriver(new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4444/wd/hub"), caps));
        driver = threadLocalDriver.getTLDriver();
        steps = new Steps(driver);
        //Thread.sleep(5000);
    }

    @AfterMethod
    public synchronized void teardown() {
        driver.quit();
    }
}
