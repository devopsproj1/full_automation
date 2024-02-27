package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch__only_frame_in_wepage {
    public static void main(String[] args) {

        //web page should be only one in web page so by default index of that frame is 0
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement frameElement=driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));//xpath of frame element
        driver.switchTo().frame(0);//switch to frame by index to only frame in web page
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();//locate text ui and clear
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("handle frame");//send char
    }
}
