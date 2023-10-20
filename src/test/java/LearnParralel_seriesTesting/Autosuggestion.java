package LearnParralel_seriesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Autosuggestion {
        public static String text;
    public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println("enter the url of application");
            Scanner sc = new Scanner(System.in);
            String url = sc.nextLine();
            driver.get(url);
            System.out.println("enter the word");
            String word = sc.nextLine();
            driver.findElement(By.name("q")).sendKeys(word);
            Thread.sleep(5000);
            List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
            ArrayList<String> list = new ArrayList<>();
            System.out.println("Total no of autosuggestion "+allOptions.size());
            for (int i=0;i< allOptions.size();i++){
                     text = allOptions.get(i).getText();
                    list.add(text);
                    //System.out.println(text);
            }

            Iterator<String> itr = list.iterator();
            while (itr.hasNext()){
                    System.out.println(itr.next());
            }

    }

}
