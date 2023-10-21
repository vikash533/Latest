package LearnParralel_seriesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        try{
            driver.findElement(By.xpath("//span[normalize-space()='✕']")).click();
        }catch (Exception e){
            driver.findElement(By.xpath("//span[normalize-space()='✕']")).click();
        }
        driver.findElement(By.name("q")).sendKeys("iphone14");
        List<WebElement> auto= driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
        for (int i = 0; i < auto.size(); i++) {
            String text = auto.get(i).getText();
            System.out.println(text);
        }

    }
}
