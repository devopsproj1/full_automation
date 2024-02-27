package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_element_by_className {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        driver.findElement(By.className("classone")).sendKeys("classname");
        driver.findElement(By.partialLinkText("Selenium143")).click();

        WebDriver driver2=new ChromeDriver();
        driver2.get("https://omayo.blogspot.com/");
        driver2.manage().window().maximize();
        driver2.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click();

        WebDriver driver3=new ChromeDriver();
        driver3.get("https://omayo.blogspot.com/");
        driver3.manage().window().maximize();
        driver3.findElement(By.cssSelector("#ta1")).sendKeys("css selector");

        WebDriver driver4=new ChromeDriver();
        driver4.get("https://omayo.blogspot.com/");
        driver4.manage().window().maximize();
        driver4.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("by xpath");
}}
