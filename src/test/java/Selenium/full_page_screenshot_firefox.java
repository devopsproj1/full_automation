package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class full_page_screenshot_firefox {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        File src= ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);//only applicalefor_chrome
        File dest=new File("./omayo2/full_page_firefox_png.png");
        FileHandler.copy(src,dest);
    }
}
