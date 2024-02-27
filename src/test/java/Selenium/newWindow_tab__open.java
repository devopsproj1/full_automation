package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindow_tab__open {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://selenium143.blogspot.com/");
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.blogger.com/about/?bpli=1");
        Thread.sleep(5000);
        driver.switchTo().window("xyz");//exception no such window throw

    }
}
