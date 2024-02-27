package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_url {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");//launch url
        driver.get("https://chromewebstore.google.com/?hl=en");//launch url in same tab
        driver.get("omayo.blogspot.com");//invalid argument exception throw  due to incomplete url


    }
}
