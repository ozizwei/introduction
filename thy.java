import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class thy {
    public static void main(String[] args) {
        System.setProperty ( "webdriver.gecko.driver", "C:\\Users\\Asus\\Documents\\TESTING\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver ();
        driver.get ( "https://www.turkishairlines.com/de-de/index.html" );
        driver.findElement ( By.xpath ( "//a[@data-type='oneway']" ) ).click ();
        driver.findElement ( By.cssSelector ("button[data-id*='from_select']")).click ();
        driver.findElement ( By.xpath("//*[text()='von']")).sendKeys ( "IS" );
        /*source.clear ();
        source.sendKeys ( "HAM" );
        for (int i=0;i<3;i++)
        {
            source.sendKeys ( Keys.ARROW_DOWN );
        }
        source.sendKeys ( Keys.ENTER );*/
    }
}