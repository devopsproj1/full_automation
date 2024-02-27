package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Html_select_drop_down_by_method {
    static By fruit_loc=By.id("fruits");
    static  By lang_loc= By.id("lang");

   static WebDriver driver;
    public static void main(String[] args) {
       driver= new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();
        sel_elemt(fruit_loc,"Mango");
        sel_elemt(lang_loc,"Python");


    }
    static  WebElement locate_dropdown(By field){
        return driver.findElement(field);
    }
    static void sel_elemt(By field,String Visible_opyion){
        Select select=new Select(locate_dropdown(field));
        select.selectByVisibleText(Visible_opyion);

    }



}
