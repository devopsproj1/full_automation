package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_to_frame_by_webelement {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement frameElement=driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));//xpath of frame element
        driver.switchTo().frame(frameElement);//switch to frame
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();//locate text ui and clear
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("handle frame");//send char

    }
}
