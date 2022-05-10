package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        // maximize iken boyutları alalım
        System.out.println("maximize konum : "+driver.manage().window().getPosition());
        System.out.println("maximize olculeri : "+driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        // fulscreen boyutları alalım

        System.out.println("fullscreen maximize konum : "+driver.manage().window().getPosition());
        System.out.println("fullscreen maximize olculeri : "+driver.manage().window().getSize());


    }
}
