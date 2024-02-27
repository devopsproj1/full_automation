package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bootstrap_without_select_dropdown {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);

        driver.get("https://www.hdfc.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"container-2a5d129efc\"]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"close-insta-call\"]/span")).click();
        Thread.sleep(3000);

        WebElement drop_opt=driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[1]/div"));
        drop_opt.click();
        Thread.sleep(3000);

        WebElement elem2=driver.findElement(By.xpath("//*[@id=\"productType\"]/li[4]"));
        elem2.click();
        Thread.sleep(3000);
        WebElement elem3=driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[2]/div"));
        elem3.click();
        Thread.sleep(3000);
        WebElement opt4=driver.findElement(By.xpath("//*[@id=\"productName\"]/li[2]"));
        opt4.click();

    }
}
