package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class no_suc_element_excep_with_multi_window {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Open a popup window")).click();
        String popup=driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
        System.out.println(popup);
    }
}
