package Selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationCordinate_of_ui_element {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Point Cordinate = driver.findElement(By.id("confirm")).getLocation();
        System.out.println(Cordinate.x);
        System.out.println(Cordinate.y);
    }
}
