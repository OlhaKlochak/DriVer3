package config;

import org.openqa.selenium.WebDriver;

public class BaseClass {
   static public WebDriver driver = ConfigurationWebDriver.createDriver(Webdrivers.CHROME_INCOGNITO);
}
