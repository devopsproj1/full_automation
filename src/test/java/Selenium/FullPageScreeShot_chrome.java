package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class FullPageScreeShot_chrome {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//not applicable for chrome
        File dest=new File("./omayo2/full_page_chrome_png.png");
        FileHandler.copy(src,dest);
    }
}
