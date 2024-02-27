package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class screen_shot_of_ui_element {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement esnap=driver.findElement(By.linkText("Page One"));
        File src= esnap.getScreenshotAs(OutputType.FILE);
        File dest=new File("./omayo_png/element.png");
        FileHandler.copy(src,dest);
    }
}
