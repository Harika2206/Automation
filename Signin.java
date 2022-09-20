import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Signin {
	
 {
	System .setProperty("webdriver.chrome.driver","C:\\Users\\konjetiharika.v\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com/");
    driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
    driver.manage().window().maximize();
   
     driver.findElement(By.id("username")).sendKeys("harika");
     driver.findElement(By.id("password")).sendKeys("Harika@22");
      driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
}
	}

