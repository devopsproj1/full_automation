package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class retrieve_attributeValue_of_uiElement {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        String ui_att_value=driver.findElement(By.xpath("//button[@id='myBtn']")).getAttribute("id");
        System.out.println(ui_att_value);
        String href_att=driver.findElement(By.xpath("//body/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).getAttribute("href");
        System.out.println(href_att);
    }
}
