package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_element_by_name {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("amit");
}}
