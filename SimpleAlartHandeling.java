import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SimpleAlartHandeling {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Select Input Field
        WebElement element=driver.findElement(By.name("cusid"));
        element.sendKeys("dfdf");
        driver.findElement(By.name("AccSubmit")).click();
       Alert alert= driver.switchTo().alert();
       alert.accept();
    }
}
