package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_sleep {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.className("dropbtn")).click();
        Thread.sleep(7000);
        driver.findElement(By.linkText("Gmail")).click();
    }

}
