package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class static_table {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> th = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
        List<WebElement> rdata = driver.findElements(By.xpath("//*[@id=\"table1\"]//tr/td"));
        System.out.println(th.size());
        System.out.println(rdata.size());
        for (WebElement e:th){

            System.out.println(e.getText());

        }
     for (WebElement rd:rdata){
         System.out.println(rd.getText());
     }

    }
}
