package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_popup_window {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
        driver.close();//only close main single tab
        Thread.sleep(5000);
        driver.quit();//force fully close browser all tab
    }
}
