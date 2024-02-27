package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_use {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
       WebElement TextElement=driver.findElement(By.id("textbox1"));//reduce duplicate code writing
       TextElement.clear();//clear text within text area
       TextElement.sendKeys("amit");//write charcter or string in text area
       TextElement.clear();
       TextElement.sendKeys("Kumar");
       TextElement.clear();
       TextElement.sendKeys("Sah");

    }
}
