package LearnParralel_seriesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class AllLink {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("enter the url of application");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        driver.get(url);
        List<WebElement> allLink = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links present "+allLink.size());
        for(int i=0;i< allLink.size();i++){
            String text = allLink.get(i).getText();
            System.out.println(text);
        }
    }
}
