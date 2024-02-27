package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_alert {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("alert1")).click();
        Alert alert=driver.switchTo().alert();//alert handeled
        String alert_txt=alert.getText();//retrive text on alert
        System.out.println(alert_txt);
        alert.accept();//press ok on alert



    }
}
