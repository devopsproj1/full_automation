package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_curso_move_to_element {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement e1=driver.findElement(By.id("blogsmenu"));
        WebElement e2=driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[3]/a/span"));
        Actions actions=new Actions(driver);
        actions.moveToElement(e1).perform();
        actions.moveToElement(e2).click().build().perform();

    }
}
