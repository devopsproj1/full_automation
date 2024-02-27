package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class click_multi_links_without_stale_ref_excep {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        List<WebElement> links = driver.findElements(By.xpath("(//div[@id='LinkList1']//a)"));
           int no_of_links=links.size();
           String path="(//div[@id='LinkList1']//a)";
        for (int i=1;i<=no_of_links;i++){
            String sep_links=path+"["+i+"]";
            driver.findElement(By.xpath(sep_links)).click();
           String c_url= driver.getCurrentUrl();
            System.out.println(c_url);
            driver.navigate().back();


        }

    }
    }


