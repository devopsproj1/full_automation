package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locate_element_by_Html_tag_name {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> links_url = driver.findElements(By.tagName("a"));//locate elements by html tag name
        for (WebElement e:links_url){
            System.out.println(e.getAttribute("href"));//locate all anchor element

        }

    }
}
