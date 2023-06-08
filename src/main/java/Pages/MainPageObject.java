package Pages;

import Util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MainPageObject {

    private WebDriver driver;



    private By CourseRate = new By.ByXPath("//span[@class='course-rating_average']");
    private By CourseDescription = new By.ByXPath("//div[@class='introduction_info introduction-info']");

    private By ButtonCoachesNames = new By.ByXPath("//button[@id='coachesShowAllButton']");

    @FindBy(xpath = "//p[@class='coach-card_name']")
    List<WebElement> CoachList;


    public MainPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getCourseTitle() {
        return driver.getTitle();
    }

    public WebElement getCourseRate() {
        return driver.findElement(CourseRate);
    }

    public WebElement getCourseDescription() {
        return driver.findElement(CourseDescription);
    }

    public WebElement ScrollTobutton() {
        Util.ScrollToelement(driver, By.xpath("//button[@id='coachesShowAllButton']"));
//        WebElement ButtonCoachesName = new WebDriverWait(driver, Duration.ofSeconds(300))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='coachesShowAllButton']")));
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.
                elementToBeClickable(By.xpath("//button[@id='coachesShowAllButton']")));
        return driver.findElement(ButtonCoachesNames);

    }
    public WebElement getButtonCoachesNames(){
        return driver.findElement(ButtonCoachesNames);

    }
    public List<String> getCoachList() {
        List<WebElement> elements = driver.findElements(By.xpath("//p[@class='coach-card_name']"));
        List<String> CoachList = new ArrayList<String>();

        for (WebElement element : elements) {
            System.out.println(element.getText());
            CoachList.add(element.getText());
        }
        return CoachList;
    }
    }












