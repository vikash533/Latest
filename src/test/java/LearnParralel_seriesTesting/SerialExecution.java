package LearnParralel_seriesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class SerialExecution {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters({"browser"})
    void setup(String br) {
        if (br.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (br.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (br.equalsIgnoreCase("opera")) {
            driver = new EdgeDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    void testLogo() {
        try {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='company-branding']"))));
            boolean flag = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
            Assert.assertTrue(flag);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test(priority = 2)
    void testHomepageTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Titles are not matched");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
