package mobileworld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;






public class signin {
     @Test(dataProvider="login")//LOGIN
        public void sign(String username,String Password) throws Exception
        {
        
            System.setProperty("webdriver.chrome.driver","C:\\Users\\konjetiharika.v\\Downloads\\chromedriver_win32\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
                 
                signinlandingpage page=new signinlandingpage(driver);
                page.goTo();
               // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                page.signin.click();
                Thread.sleep(2000);
                page.username.sendKeys(username);
                Thread.sleep(2000);
                page.password.sendKeys(Password);
                Thread.sleep(2000);
                page.loginbutton.click();
                driver.close();
        }
        @DataProvider(name="login")
        public Object[][] getdata()
        {
            Object [][] data=new Object[4][2];
          data [0][0]="Harika";
          data [0][1]="Harika@123";
          data [1][0]="ab";
          data [1][1]="6fwdvf1";
          data [2][0]="nvjifnbvdhcfbjfdbinefjibdf";
          data [2][1]="hak@1233";
          data [3][0]=" ";
          data [3][1]="H227dbdi3";







       return data;
        }
}