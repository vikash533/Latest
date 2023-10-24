package MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DatePickers {
    public WebDriver driver;
    public WebDriverWait wait;
    public String month = "December 2023";
    String date ="25";

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    @Test
    void testScript() throws InterruptedException {

        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(frame);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("datepicker"))));
        driver.findElement(By.id("datepicker")).click();

       // WebElement leftClick = driver.findElement(By.xpath("(//a[@data-event='click'])[1]"));

        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"))));
        while (true){
            String calendarMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
            if(calendarMonth.equalsIgnoreCase(month)){
                break;
            }
            else {
                driver.findElement(By.xpath("(//a[@data-event='click'])[2]")).click();
            }
        }
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        for (WebElement dat:dates
             ) {
            if(dat.getText().equalsIgnoreCase(date)){
                dat.click();
            }
        }
    }
}
