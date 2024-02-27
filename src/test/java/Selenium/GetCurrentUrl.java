package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        String page_one=driver.getCurrentUrl();
        System.out.println(page_one);//provide primary tab web url


        driver.findElement(By.id("link1")).click();
        String pagetwo_url=driver.getCurrentUrl();//provide  web url when opened in same tab
        System.out.println(pagetwo_url);

    }
}
