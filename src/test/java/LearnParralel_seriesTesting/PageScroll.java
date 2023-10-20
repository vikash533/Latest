package LearnParralel_seriesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageScroll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com.au/");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        //scroll by using x,y co-ordinate
        //js1.executeScript("window.scrollTo(0,1500)");
        // WebElement element1 = driver.findElement(By.xpath("//span[normalize-space()='Household']"));
        //scroll upto an element
        // js1.executeScript("arguments[0].scrollIntoView();",element1);
        //scroll bottom to page
        //js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
}
