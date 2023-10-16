package org.fleksa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Autosuggestive {
    WebDriver driver;

    @BeforeTest
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test
    void testScript() {
        WebElement temp = null;
        driver.findElement(By.name("q")).sendKeys("java");
        List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@id='Alh6id']//span[contains(text(),'java')]"));
        for (int i = 0; i < autoSuggestion.size(); i++) {
            System.out.println(autoSuggestion.get(i).getText());
        }
//        for(WebElement suggestion:autoSuggestion){
//            String text = suggestion.getText();
//            System.out.println(text);
//            if(text.equalsIgnoreCase("javatpoint")){
//                temp = suggestion;
//            }
//        }
//
//        temp.click();
//        ArrayList<WebElement> list = new ArrayList<>(autoSuggestion);
//        for (int i = 0; i < list.size(); i++) {
//            String text = list.get(i).getText();
//            System.out.println(text);
        //autoSuggestion.get(3).click();
//            break;
//        }

    }
}
