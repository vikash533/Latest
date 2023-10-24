package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AirIndeaExpress {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.airindiaexpress.com/home");
        WebElement imglogo = driver.findElement(By.xpath("//img[@class='img-logo']"));
        System.out.println(imglogo.isDisplayed());
        WebElement dropDown = driver.findElement(By.xpath("(//div[@class='flight-search-source-field-read-only']/parent::div)[1]"));
        dropDown.click();
        Thread.sleep(5000);
        List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='recent-list-items list-group']/child::button"));
//        for (WebElement opt:allOptions
//             ) {
//            String text=opt.getText();
//            System.out.println(text);
//
//        }
        ArrayList<WebElement> list = new ArrayList<>();
        list.add((WebElement) allOptions);
        list.get(3).click();

    }
}
