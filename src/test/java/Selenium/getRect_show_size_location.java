package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect_show_size_location {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Rectangle Rect = driver.findElement(By.id("confirm")).getRect();
        System.out.println(Rect.x);
        System.out.println(Rect.height);
        System.out.println(Rect.getHeight());
        System.out.println(Rect.getX());
    }
}
