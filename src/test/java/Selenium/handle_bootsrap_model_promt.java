package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class handle_bootsrap_model_promt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[1]/a/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("mfp-close")).click();


    }

}
