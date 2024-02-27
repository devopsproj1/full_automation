package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_push_notificatio {
    public static void main(String[] args) {

        ChromeOptions option=new ChromeOptions();//create ChromeOptions object
        option.addArguments("--disable-notifications");//add arguement --disable-notifications


        WebDriver driver=new ChromeDriver(option);//pass Chrome option obj ref to web driver constructor
        driver.manage().window().maximize();
        driver.get("https://www.justdial.com/");
    }
}
