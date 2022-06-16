package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Q3 {

            // ...Exercise3...

            public static void main(String[] args) throws MalformedURLException {
                System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

                WebDriver driver =new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


// go to url : https://www.techlistic.com/p/selenium-practice-form.html
                driver.navigate().to(new URL("https://www.techlistic.com/p/selenium-practice-form.html"));
                //fill the firstname
                WebElement firstnameElement = driver.findElement(By.name("firstname"));
                firstnameElement.sendKeys("kadir");
                //fill the Lastname
                driver.findElement(By.name("lastname")).sendKeys("tepeceikkkk");
                //check the gender
                driver.findElement(By.id("sex-0")).click();
                //check the experience
                driver.findElement(By.id("exp-3")).click();
                //fill the date
                driver.findElement(By.id("datepicker")).sendKeys("17/05/2022");
                //choose your profession -> Automation Tester
                driver.findElement(By.id("profession-1")).click();
                //choose your tool -> Selenium Webdriver
                driver.findElement(By.id("tool-2")).click();
                //choose your continent -> Antartica
                driver.findElement(By.xpath("//*[text()='Antartica']")).click();
                //choose your command  -> Browser Commands
                driver.findElement(By.xpath("//*[text()='WebElement Commands']")).click();

                //click submit button
                driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

                driver.close();





            }


}
