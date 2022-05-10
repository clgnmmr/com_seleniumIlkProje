package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_GetPageSource {
    public static void main(String[] args) {
// amazon sitesine gidip Kaynak kodlarinda "spend less" yazdigini test edin
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        String sayfaKaynakKodlari=driver.getPageSource();
        String arananKod="Spend  less";
        if (sayfaKaynakKodlari.contains(arananKod)){
            System.out.println("kaynak KoduTesti PASSED");

        }else System.out.println("Kaynak kodlarinda :"+arananKod+" yok, Test FAİLED");
driver.close();
    }
}
