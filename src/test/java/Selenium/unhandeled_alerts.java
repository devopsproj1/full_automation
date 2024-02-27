package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class unhandeled_alerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("alert1")).click();
        String Btn_text=driver.findElement(By.id("alert1")).getText();//Throw unhandled alert exception
        System.out.println(Btn_text);

    }
}
