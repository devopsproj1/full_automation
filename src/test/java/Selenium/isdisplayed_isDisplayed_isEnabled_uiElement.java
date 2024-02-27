package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed_isDisplayed_isEnabled_uiElement {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        Boolean Display_status=driver.findElement(By.id("but2")).isDisplayed();
        System.out.println(Display_status);

        Boolean Enable_status=driver.findElement(By.id("but1")).isEnabled();
        System.out.println(Enable_status);

        Boolean Display2_status=driver.findElement(By.className("title")).isEnabled();
        System.out.println(Display2_status);

         Boolean select_status=driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
        System.out.println(select_status);





    }
}
