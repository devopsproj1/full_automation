package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_of_webpage {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com");
        String Title_webpage=driver.getTitle();//get title of web page
        System.out.println(Title_webpage);
    }
}
