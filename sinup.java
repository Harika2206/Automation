import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class sinup
{  
  {         
            System.setProperty("webdriver.chrome.driver","C:\\Users\\konjetiharika.v\\Downloads\\chromedriver_win32\\chromedriver.exe");        
            WebDriver driver=new ChromeDriver();
           
            driver.get("https://mobileworld.banyanpro.com/");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            driver.findElement(By.linkText("Sign up")).click();
            driver.findElement(By.id("myName")).sendKeys("Harika");
            driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("k");
            driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("harika@gmail.com");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Harika@22");
            driver.findElement(By.xpath("//input[@type='date']")).sendKeys("22/06/2001");
            driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
            driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("7525782822");
            driver.findElement(By.cssSelector("textarea[placeholder='Short Bio']")).sendKeys("hii");
            driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(driver.switchTo().alert().getText());
            driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
            System.out.println(driver.switchTo().alert().getText());
        
    }
}