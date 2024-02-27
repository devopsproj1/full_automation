package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_to_frame_by_id_OR_name_Attribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("handle frame");

    }
}
