package MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class SwitchFrame001 {
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
        Set<String> windIds = driver.getWindowHandles();
        ArrayList<String> list = new ArrayList<>(windIds);
        driver.switchTo().window(list.get(1));
        try {
            driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
        }
        catch (Exception e){
            driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
        }
        driver.switchTo().window(list.get(0));
        driver.findElement(By.xpath("//ul[@class='fltRecentSearches']/child::li[2]/child::a/child::p")).click();
        driver.quit();

    }
}
