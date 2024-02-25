package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_key__up_down_press {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement comp_link=driver.findElement(By.linkText("compendiumdev"));
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.CONTROL).moveToElement(comp_link).click().keyUp(Keys.CONTROL).build().perform();
    }
}
