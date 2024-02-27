package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url_auth_popup {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//  userid:password@  format put in url
        String title=driver.getTitle();
        System.out.println(title);
        String ui_text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        System.out.println(ui_text);
    }
}
