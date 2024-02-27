package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_drag_drop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement source=driver.findElement(By.id("box1"));
        WebElement target=driver.findElement(By.id("box107"));
        WebElement source2=driver.findElement(By.id("box3"));
        WebElement target2=driver.findElement(By.id("box106"));
        Actions actions=new Actions(driver);
       actions.dragAndDrop(source,target).perform();//both line work for drag and drop
        actions.clickAndHold(source2).moveToElement(target2).release().perform();//both line work for drag and drop

    }
}
