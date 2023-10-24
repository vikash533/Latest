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

public class BookTicket {
    public String month ="December 2023";
    public String date="23";
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
        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        List<WebElement> drpDown = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        drpDown.get(2).click();
        driver.findElement(By.xpath("//label[@for='toCity']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@id='react-autowhatever-1']//li"))));
        List<WebElement> toCityDropDown = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']//li"));
        toCityDropDown.get(5).click();
        while (true){
            String firstMonthOption = driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption'][1]")).getText();
            String secondMonthOption = driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Caption'][1]")).getText();
            if(firstMonthOption.equalsIgnoreCase(month))
                break;
            else if (secondMonthOption.equalsIgnoreCase(month))
                break;
            else
                driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
        }
        List<WebElement> datePicker = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/child::div[1]/div[@class='DayPicker-Body']//div//p"));
        for (WebElement datePick:datePicker) {
            String text =datePick.getText();
            if(date.equalsIgnoreCase(text)){
                datePick.click();
                break;
            }
        }
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
        try {
            driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
        }
        catch (Exception e){
            driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
        }
    }
}
