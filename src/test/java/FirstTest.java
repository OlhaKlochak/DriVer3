import Util.Util;
import config.BaseClass1;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.List;

public class FirstTest extends BaseClass1 {
    By course = new By.ByXPath("//button[@data-dropdown-trigger='coursesMenu']");
    By search = new By.ByXPath("//button[@data-category='programming']");
    By list = new By.ByXPath("//button[@id='coachesShowAllButton']");
    By coachList = new By.ByXPath("//p[@class='coach-card_name']");
    By Fomenko = new By.ByXPath("//p[text()='Андрій Фоменко']");


    @BeforeClass
    public static void BeforeFirstTest() {
        driver.get("https://dnipro.ithillel.ua/");
    }

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(course).click();
        driver.findElement(search).click();
        driver.get("https://ithillel.ua/courses/front-end-basic");
        Util.ScrollToelement(driver,By.xpath("//button[@id='coachesShowAllButton']"));
        driver.findElement(By.xpath("//button[@id='coachesShowAllButton']")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//p[@class='coach-card_name']"));
        for (WebElement element : elements) {
            System.out.println(element.getText());

            Thread.sleep(5000);
        }


    }
}
  //  @Test
   // public void test3() {
    //    driver.get("https://ithillel.ua/courses/front-end-basic");
    //    ScrollToelement(driver, By.xpath("//ul[@class='coach-list coaches_list']"));
    //    driver.findElement(list).click();
    //    driver.findElement(coachList);
   // }

   // @Test
   // public void test4() {
    //    System.out.println(driver.findElements(coachList));


  //  }
//}



