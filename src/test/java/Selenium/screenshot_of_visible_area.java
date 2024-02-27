package Selenium;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot_of_visible_area {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("./omayo2/omayo.png");
        FileUtils.copyFile(srcfile,dest);//create file folder auto at time of providing pah in dest.
    }
}
