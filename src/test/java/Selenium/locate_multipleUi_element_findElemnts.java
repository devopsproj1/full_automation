package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locate_multipleUi_element_findElemnts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement option = driver.findElement(By.xpath("//select[@id='multiselect1']/option"));//find element locate only first one element
        System.out.println(option.getText());

        List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));//find elements locate multiple ui elements
       for (WebElement e: options){
           System.out.println(e.getText());
       }

    }
}
