

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myCITest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        
        // Go to the Google Suggest home page
        driver.get("http://www.google.com/webhp?complete=1&hl=en");
        
        // Enter the query string "Cheese"
        System.out.println("Finding search box");
        WebElement query = driver.findElement(By.name("q"));
        System.out.println("Finding Cheese");
        
        query.sendKeys("Cheese");
        driver.findElement(By.name("btnG")).click();
        Thread.sleep(4000);
        driver.quit();
        
    }
}