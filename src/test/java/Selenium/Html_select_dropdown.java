package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_select_dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement options=driver.findElement(By.id("drop1"));//return web element and store in variable
        Thread.sleep(3000);
        Select select=new Select(options);//need to create select object and passed web element obj-ref/variable
        select.selectByIndex(1);//select by index value
        Thread.sleep(3000);
        select.selectByValue("mno");//select bb value ttribute
        Thread.sleep(3000);
        select.selectByVisibleText("doc 1");//select by visible linked text
    }
}
