package MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class SwitchFrame {
    public WebDriver driver;
    public WebDriverWait wait;
    @BeforeClass
     void setup(){
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         driver.get("https://www.makemytrip.com/");
         wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    @Test
    void testScript(){
        try {
            driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        }catch (Exception e){
            driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        }

        driver.findElement(By.xpath("//ul[@class='fltRecentSearches']/child::li/child::a/child::p")).click();
        String parentWindow = driver.getWindowHandle();
        Set<String> windIds = driver.getWindowHandles();
        for (String winid: windIds) {
            System.out.println(winid);
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);
            if(title.equalsIgnoreCase("Challenge Validation")){
                driver.switchTo().window(winid);
            }
        }
        try {
            driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
            }
        catch (Exception e){
            driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
              }
        driver.switchTo().window(parentWindow);
        driver.findElement(By.xpath("//ul[@class='fltRecentSearches']/child::li[2]/child::a/child::p")).click();


    }
}
