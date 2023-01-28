package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ThreadLocalDriver {
    private static final ThreadLocal<AppiumDriver<MobileElement>> tlDriver = new ThreadLocal<>();

    public synchronized void setTLDriver(AppiumDriver<MobileElement> driver) { tlDriver.set(driver); }

    public synchronized AppiumDriver<MobileElement> getTLDriver() {
        return tlDriver.get();
    }
}
