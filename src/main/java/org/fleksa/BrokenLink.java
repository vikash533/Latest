package org.fleksa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class BrokenLink {
    public WebDriver driver;
    @BeforeTest
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
    }
    @Test
    void testScript(){
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("total no of links:- "+allLinks.size());
        int brokenLink = 0;
        for (var link:
             allLinks) {
            String targetLink = link.getAttribute("href");
            System.out.println("Target link "+targetLink);
            if(targetLink==null || targetLink.isEmpty()) {
                brokenLink++;
                continue;
            }
        }
        System.out.println("BrokenLink "+brokenLink);
    }
}
