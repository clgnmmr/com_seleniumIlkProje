package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        //driver.getWindowHandle() = CDwindow-54DE824A975D9D42E768EC8B3872ECCB
        // benzersiz olarak sayfalrın hash kodu vardır.


    }
}
