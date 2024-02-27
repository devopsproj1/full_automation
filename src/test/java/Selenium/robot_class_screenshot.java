package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class robot_class_screenshot {
    public static void main(String[] args) throws AWTException, IOException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        Robot robot=new Robot();
        Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle=new Rectangle(d);
        BufferedImage buff_image = robot.createScreenCapture(rectangle);
        // String dest=System.getProperty("user.dir")+"//omayo2//robot.png";
         File desfile=new File("./omayo2/robot2.png");
        ImageIO.write(buff_image,"png", new File((String.valueOf(desfile))));

        //can take alert in snap


    }
}
