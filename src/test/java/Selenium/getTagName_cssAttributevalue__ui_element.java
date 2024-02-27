package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName_cssAttributevalue__ui_element {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        String Ui_element_tagName=driver.findElement(By.className("title")).getTagName();
        System.out.println(Ui_element_tagName);
        String Ui_element_cssValue=driver.findElement(By.className("title")).getCssValue("font");
        System.out.println(Ui_element_cssValue);
    }
}
