package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_child_nested_frame {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-left");
        WebElement el=driver.findElement(By.xpath("/html/body"));
        System.out.println(el.getText());
        driver.switchTo().parentFrame();//switch to current parent

        driver.switchTo().frame("frame-middle");
        WebElement em=driver.findElement(By.xpath("/html/body"));
        System.out.println(em.getText());
        driver.switchTo().parentFrame();//switch to current parent

        driver.switchTo().frame("frame-right");
        WebElement er=driver.findElement(By.xpath("/html/body"));
        System.out.println(er.getText());
        driver.switchTo().parentFrame();



        driver.switchTo().defaultContent();//switch to main web page
        driver.switchTo().frame("frame-bottom");
        WebElement eb=driver.findElement(By.xpath("/html/body"));
        System.out.println(eb.getText());



    }
}
