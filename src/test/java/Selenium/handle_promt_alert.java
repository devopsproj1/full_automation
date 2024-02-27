package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_promt_alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("This is Priompt text");//write text to promt
         String alert_text=alert.getText();//retrive promt text
        System.out.println(alert_text);
        Thread.sleep(10000);
        alert.accept();
    }
}
