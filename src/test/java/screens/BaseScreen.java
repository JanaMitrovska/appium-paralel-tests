package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.time.Duration;
import java.util.List;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BaseScreen {
    protected AppiumDriver<MobileElement> driver;
    protected WebDriverWait                wait;

    public BaseScreen(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    protected void waitAndClick(MobileElement by) { wait.until(ExpectedConditions.visibilityOf(by)).click(); }

    protected void click(By by) {
        driver.findElement(by).click();
    }

    public void goBack() { driver.navigate().back(); }

    protected List<WebElement> waitAndFindElements(By by) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    protected WebElement waitAndFindElement(MobileElement by) {
        return wait.until(ExpectedConditions.visibilityOf(by));
    }

    protected String getText(MobileElement by) {
        return waitAndFindElement(by).getText();
    }

    protected void sendKey(MobileElement by, String text) {
        waitAndFindElement(by).sendKeys(text);
    }
}
