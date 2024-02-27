package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_browser {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("link1")).click();
        driver.close();//close browser for only tab open condition and also close only
                        // one tab when multiple tab opened
    }
}
