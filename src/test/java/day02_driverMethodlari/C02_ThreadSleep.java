package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_ThreadSleep {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.get("https://www.amazon.com");

        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("PASSED");
            System.out.println("Currently Url contains \""+expectedTitle+"\" ");
        }else {
            System.out.println("FAİLED");
            System.out.println("actualUrl :" +actualTitle);
            System.out.println("expectedUrl :" +expectedTitle);


        }

        driver.get("http://kadirtepecik.epizy.com/index.html");
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
