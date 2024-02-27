package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class tab_key_press {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("Amit");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys("shah").sendKeys(Keys.TAB).sendKeys("amit@gmail.com")
                .sendKeys(Keys.TAB).sendKeys("12345678")
                .sendKeys(Keys.TAB).sendKeys("262373721")//press tab and enter charctert data
                .sendKeys(Keys.TAB).sendKeys("12345566")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
    }
}
