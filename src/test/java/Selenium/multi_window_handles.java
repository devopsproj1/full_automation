package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class multi_window_handles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(10000);
        String active_win_id = driver.getWindowHandle();

        driver.findElement(By.linkText("Blogger")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("selenium143")).click();
        Thread.sleep(10000);

        Set<String> multi_wind_ids = driver.getWindowHandles();
        Iterator<String> allwin_id = multi_wind_ids.iterator();
        while (allwin_id.hasNext()){
            String element = allwin_id.next();

            driver.switchTo().window(element);
            if (driver.getTitle().equals("Selenium143")){
                System.out.println("this is new tab sel243");

             String newtab=driver.findElement(By.linkText("What is Selenium?")).getText();
                System.out.println(newtab);

            } else if (driver.getTitle().equals("omayo (QAFox.com)")) {
                System.out.println("this is main wndow");

                String title=driver.findElement(By.className("title")).getText();
                System.out.println(title);


            }else if (driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")){
                System.out.println("this is Blogger page");
                String head=driver.getCurrentUrl();
                System.out.println("this is blooger head tag"+head);

            }
        }
        
    }}
