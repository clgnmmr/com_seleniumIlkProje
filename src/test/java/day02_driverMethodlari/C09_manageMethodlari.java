package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      // driver.close();

        /*
        Ilerde wait konusunu daha geniş olarak ele alacagız
        bir sayfa acılırken ılk başta sayfanın icerisinde bulunan elementlere gore
        bır yuklenme suresine bir ıhtıyac vardır
        veya bir web elementinin kullanılabilmesi icin zamana ihtiyac olabilir

        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementleri ulasım
         icin beklenecek maximum sureyi belirleme olanagı tanır
         */

        driver.quit();
    }
}
