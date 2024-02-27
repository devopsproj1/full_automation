package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dynamic_datepicker_via_methods {
    static  WebDriver driver;
    public static void main(String[] args) {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
        selectdate("20","November","2025");


    }
     public  static  void selectdate(String selday,String selmonth,String selyear){


        String c_m_y = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
        String[] date=c_m_y.split(" ");//split text by reg x andreturn array
        String month=date[0];//feb
        String Year=date[1];//2024
        while (!(month.equals(selmonth) && Year.equals(selyear))){

            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
            c_m_y = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
            date=c_m_y.split(" ");//split text by reg x andreturn array
            month=date[0];
            Year=date[1];

        }
        driver.findElement(By.linkText(selday)).click();

    }

}
