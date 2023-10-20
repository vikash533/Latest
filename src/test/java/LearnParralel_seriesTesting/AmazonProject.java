package LearnParralel_seriesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AmazonProject {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com.au/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
        Thread.sleep(5000);
        //ArrayList<WebElement> list = new ArrayList<>();
        List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/child::div"));
        for (WebElement sugestion : autosuggestion) {
            //list.add(sugestion);
            String text = sugestion.getText();
//            System.out.println(text);
            if(text.equalsIgnoreCase("iphone 11")){
                sugestion.click();
                break;
            }
        }
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com/");
        try{
            driver.findElement(By.xpath("//span[normalize-space()='✕']")).click();
        }catch (Exception e){
            driver.findElement(By.xpath("//span[normalize-space()='✕']")).click();
        }
        driver.findElement(By.name("q")).sendKeys("iphone 11");
        List<WebElement> auto= driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
        for (int i = 0; i < auto.size(); i++) {
            String text = auto.get(i).getText();
            System.out.println(text);
            if(text.equalsIgnoreCase("iphone 11")){
                auto.get(i).click();
                break;
            }
        }

        driver.close();
    }
}