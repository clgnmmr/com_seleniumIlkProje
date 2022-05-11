package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C10_HomeWork {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin

        String actualTitle=driver.getTitle();
        String excualtyTitle="facebook";

        if (actualTitle.equals(excualtyTitle)){
            System.out.println("Title  aranan baslık iceriyor   PASSED ");

        }else  System.out.println("Title  aranan baslık icermiyor   FAİLED \n TİTLE : "+driver.getTitle());

//.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’ yazdirin.
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(excualtyTitle)){
            System.out.println("Url aranan kelimeyi iceriyor  PASSED    URL: "+driver.getCurrentUrl());
        }else System.out.println("Url aranan kelimeyi icermiyor \n actualUrl :"+driver.getCurrentUrl());
        Thread.sleep(5000);

        //.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
// Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String yeniBaslik = driver.getTitle();
        String arananKelime="Walmart.com";
        if (yeniBaslik.contains(arananKelime)){
            System.out.println(driver.getTitle()+" aranan kelimeyi iceriyor PASSED");
        }else  System.out.println(driver.getTitle()+" aranan kelimeyi iceriyor FAİLED");

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(2000);

        //Sayfayi yenileyin
        driver.navigate().refresh();

        Thread.sleep(2000);

        //Sayfayi tam sayfa (maximize) yapin

        driver.manage().window().maximize();
        Thread.sleep(2000);
        //.Browser’i kapatin
        driver.close();
    }
}
