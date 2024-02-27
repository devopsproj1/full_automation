package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class setPageLoadTimeout {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));//if page not load in this time get timeout exception
        driver.get("https://omayo.blogspot.com/");

        driver.get("https://telematics.jio.com/auth/realms/JIO/protocol/openid-connect/auth?client_id=JioTelematics&redirect_uri=https%3A%2F%2Ftelematics.jio.com%2Flogin&state=5b4f471f-948b-4e7a-80de-f369bb5a99b8&response_mode=fragment&response_type=code&scope=openid&nonce=8666e3dd-ded8-4ed1-b183-2415d0ac17a2");




    }
}
