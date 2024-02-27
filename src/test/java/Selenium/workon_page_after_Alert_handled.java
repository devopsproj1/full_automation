package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workon_page_after_Alert_handled {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("alert1")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.id("ta1")).sendKeys("after alert handle text");

    }
}
