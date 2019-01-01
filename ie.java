import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\Asus\\Documents\\TESTING\\MicrosoftWebDriver.exe");
        WebDriver driver = new InternetExplorerDriver ();
        driver.get ( "http://spicejet.com" );


    }
}
