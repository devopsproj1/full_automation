package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class html_multi_selection_drpdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
       WebElement multi_options= driver.findElement(By.id("multiselect1"));
        Select select=new Select(multi_options);
        select.selectByIndex(1);
        select.selectByValue("audix");
        select.selectByVisibleText("Hyundai\n" + "  ");
        select.deselectByIndex(1);
        select.deselectByValue("audix");
        select.deselectAll();
        select.selectByVisibleText("Hyundai\n" + "  ");
        select.selectByIndex(1);
        List<WebElement> sel_optiom = select.getAllSelectedOptions();
        for (WebElement e:sel_optiom){
            System.out.println(e.getText());
        }
        List<WebElement> all_opt = select.getOptions();
        for (WebElement all_e:all_opt){
            System.out.println(all_e.getText());
        }
        WebElement first_sel_opt = select.getFirstSelectedOption();
        System.out.println(first_sel_opt.getText());


    }
}
