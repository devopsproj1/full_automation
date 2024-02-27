package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource_code {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        String htnl_source_code=driver.getPageSource();
        System.out.println(htnl_source_code);
    }
}
