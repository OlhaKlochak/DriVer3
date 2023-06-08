
import Pages.MainPageObject;


import Util.Util;
import config.BaseClass;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestMainPage extends BaseClass {

    private static MainPageObject MainPage;


    @BeforeClass
    public static void beforeTest() {
        driver.get("https://dnipro.ithillel.ua/courses/front-end-basic");

        MainPage = new MainPageObject(driver);
    }

    @Test
    public void test1() {
        System.out.println(MainPage.getCourseTitle());

    }

    @Test
    public void test2() {
        System.out.println(MainPage.getCourseRate().getText());
    }

    @Test
    public void test3() {
        System.out.println(MainPage.getCourseDescription().getText());
    }
    @Test
    public void test4(){
        MainPage.ScrollTobutton();
    }

    @Test
    public void test5() {
        MainPage.getButtonCoachesNames().click();
    }
    @Test
    public void test6(){
        MainPage.getCoachList();
}

 }


