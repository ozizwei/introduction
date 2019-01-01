import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\Documents\\TESTING\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver ();
        driver.get ( "http://spicejet.com" );
        driver.findElement( By.className ("select-label")).click ();
        driver.findElement(By.id ( "ctl00_mainContent_ddl_originStation1_CTXT" )).click ();
        driver.findElement(By.cssSelector ( "a[value='GOI']" )).click ();
        sleep ( 2000 );
        //driver.findElement(By.cssSelector("(a[value='MAA'])[2]")).click ();

        //driver.findElement(By.xpath ( "//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='COK']" )).click ();
        driver.findElement(By.id ("ctl00_mainContent_ddl_destinationStation1_CTXT" )).sendKeys ("Koc");
        driver.findElement(By.id ("ctl00_mainContent_ddl_destinationStation1_CTXT" )).sendKeys ( Keys.ENTER );
        driver.findElement(By.id ("ctl00_mainContent_view_date1" )).click ();
        //ctl00_mainContent_view_date1
        driver.findElement(By.cssSelector ( "a[class*='ui-state-active']" )).click ();
        driver.findElement(By.id ( "ctl00_mainContent_chk_IndArm" )).click ();
        //System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size ());
        driver.findElement(By.id("divpaxinfo")).click ();
        for (int i=1;i<8;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click ();
        }
        driver.findElement(By.id("btnclosepaxoption")).click ();
        Assert.assertEquals (driver.findElement(By.id("divpaxinfo")).getText (),"8 Adult");
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click ();





    }


}
