package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitform_WithoutClicksubmit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("amit bhya");
        driver.findElement(By.id("input-password")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.id("input-password")).submit();//submit form without clicking
        // on submit but selecting one form element and add .submit form will be submitted

    }
}
