package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getclass_of_obj {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        String obj_clss_name=   driver.getClass().getSimpleName();
        System.out.println(obj_clss_name);
    }
}
