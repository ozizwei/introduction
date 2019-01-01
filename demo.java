import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

    public static void main(String[] args) {
    /*
TODO Auto-generated method stub
selenium code-
Create Driver object for chrome Browser
We will strictly implement methods of webdriver.
*/

        /* Class name=Chrome driver,

                X driver name=new X();*/
        //invoke .exe file first
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());//

        //driver.get("http://de.yahoo.com/?p=us&guccounter=1");//
        //driver.navigate().back();//
        //driver.navigate().forward();//
        //driver.close(); //closes current browser//
        //driver.quit(); //closes all the browsers opened by selenium////uh-search-box
        driver.findElement ( By.cssSelector ( "[class='gLFyf gsfi']" ) ).sendKeys ( "eyvallah gocum" );
        driver.findElement ( By.cssSelector ( "[class='gLFyf gsfi']" ) ).submit ();
        driver.findElement ( By.cssSelector ( "[class='gLFyf gsfi']" ) ).clear ();
        driver.findElement ( By.cssSelector ( "[class='gLFyf gsfi']" ) ).sendKeys ( "hello there" );
        driver.findElement ( By.cssSelector ( "[class='gLFyf gsfi']" ) ).submit ();
        driver.findElement ( By.cssSelector ( "[class='j0joJb']" ) ).click ();
        driver.findElement ( By.cssSelector ( "[class='ytp-fullscreen-button ytp-button']" ) ).click ();
        try {
            Thread.sleep( 0b1001110001000L );
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        driver.findElement ( By.cssSelector ( "[class='ytp-fullscreen-button ytp-button']" ) ).click ();
        driver.findElement ( By.cssSelector ( "[id='search']" ) ).sendKeys ( "hello darkness my old friend" );
        driver.findElement ( By.cssSelector ( "[id='search']" ) ).click ();

    }

}




