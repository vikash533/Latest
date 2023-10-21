package LearnParralel_seriesTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckWebElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
        WebElement element1 = driver.findElement(By.id("email"));
        WebElement element2 = driver.findElement(By.id("password"));
        element1.clear();
        element2.clear();
        System.out.println("x-axis "+element1.getLocation().getX());
        System.out.println("y-axis "+element1.getLocation().getY());
        System.out.println("x-axis "+element2.getLocation().getX());
        System.out.println("y-axis "+element2.getLocation().getY());
        boolean flag = driver.findElement(By.xpath("//a[contains(text(),'Open')]")).isDisplayed();
        System.out.println(flag);
        WebElement element3 = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
        System.out.println(element3.getCssValue("color"));
        System.out.println(element3.getCssValue("font-family"));
        System.out.println(element3.getCssValue("font-size"));
        System.out.println(element3.getCssValue("font-weight"));
        System.out.println(element3.getCssValue("margin-bottom"));
        System.out.println(element3.getCssValue("display"));

        System.out.println("checking is enable "+element3.isEnabled());
        driver.close();

    }

}
