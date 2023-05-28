import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestHillel extends BaseClass {
    static By consultation = new By.ById("btn-consultation-hero");
    static By name = new By.ById("input-name-consultation");
    static String url = "https://dnipro.ithillel.ua/";
    static By email= new By.ById("input-email-consultation");
    static By phone = new By.ById("input-tel-consultation");
    static By telegram = new By.ByXPath("//button[@data-name=\"tg\"]");
    static By data = new By.ByXPath("//input[@name=\"tg\"]");
    static By course = new By.ById("listbox-btn-input-course-consultation");
    static By enter = new By.ByXPath("//input[@placeholder=\"Пошук\"]");
    static By search = new By.ByXPath("//li[contains(@data-entry-id,\"129290\")]");
    static By agree = new By.ByXPath("//span[contains(@class,\"checkbox_checkmark\")]");

    public static void main(String[] args) throws InterruptedException {
        driver.get(url);
       WebElement consultButton = driver.findElement(consultation);
       consultButton.click();
       WebElement inputName = driver.findElement(name);
       inputName.sendKeys("Olha");
       WebElement inputEmail = driver.findElement(email);
       inputEmail.sendKeys("olga.klochak@gmail.com");
       WebElement inputPhone = driver.findElement(phone);
       inputPhone.sendKeys("976338065");
       WebElement inputTelegram = driver.findElement(telegram);
       inputTelegram.click();
       WebElement sendData = driver.findElement(data);
       sendData.sendKeys("@Olga_Klochak");
       WebElement findCourse=driver.findElement(course);
       findCourse.click();
       WebElement enterWord = driver.findElement(enter);
       enterWord.sendKeys("QA A");
       WebElement searchCourse = driver.findElement(search);
       searchCourse.click();
       WebElement agreeMant = driver.findElement(agree);
       agreeMant.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
