package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BaseClass1 {
    public static WebDriver driver;
    @BeforeClass
    public static void BeforeParent(){
        driver = ConfigurationWebDriver.createDriver(Webdrivers.CHROME);
    }
    @AfterClass
    public static void AfterParent() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
    public static void ScrollToelement(WebDriver driver, By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean bool = false;

        while (!bool) {
            try {
                driver.findElement(by);
                bool = true;
            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,500)");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

