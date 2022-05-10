package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {
    public static void main(String[] args) throws InterruptedException {
        // en ilkel haliyle bir otomasyon yapmak icin  class ımıza otomasyon icin gerekli olan webdriverın yyerini göstermemiz gerekir
        //bunun icin java kutuphanesinden system.setproperty() methodu kullanırız
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(5000);

        driver.get("https://www.facebook.com");

        driver.close();

    }
}
