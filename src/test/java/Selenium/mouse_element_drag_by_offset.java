package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_element_drag_by_offset {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/p/page3.html");
        WebElement e1=driver.findElement(By.xpath("//*[@id=\"post-body-6103478144908648662\"]/div[1]/div[2]/form/div/div/div[2]/a[1]"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(e1,100,0).click().build().perform();
        actions.dragAndDropBy(e1,-50,0).click().build().perform();

    }
}
