import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class skyscan {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.get("http://skyscanner.de");
        driver.findElement( By.id("fsc-trip-type-selector-one-way")).click ();
        driver.findElement(By.xpath("//*[@id=\"destination-fsc-search\"]")).click ();
        driver.findElement(By.xpath("//*[@id=\"destination-fsc-search\"]")).sendKeys ("BER");
        sleep ( 2000L );
        for(int i=0;i<3;i++)
        {
            driver.findElement ( By.xpath ( "//*[@id=\"destination-fsc-search\"]" ) ).sendKeys ( Keys.ARROW_DOWN );
        }
        //driver.findElement(By.xpath("//*[@id=\"destination-fsc-search\"]")).sendKeys ( Keys.ARROW_DOWN );
        //driver.findElement(By.xpath("//*[@id=\"destination-fsc-search\"]")).sendKeys ( Keys.ARROW_DOWN );
        driver.findElement(By.xpath("//*[@id=\"destination-fsc-search\"]")).sendKeys ( Keys.ENTER);
        driver.findElement(By.xpath ( "//*[@id=\"flights-search-controls-root\"]/div/div/form/div[2]/label/span" )).click ();
        driver.findElement(By.cssSelector ( "#depart-fsc-datepicker-button > span" )).click ();
        driver.findElement(By.xpath ( "//*[@id=\"fsc-class-travellers-trigger-1PZXn\"]/span" )).click ();
        Thread.sleep ( 2000 );
        for (int h=0;h<2;h++)
        {
            driver.findElement ( By.xpath ( "//*[@id=\"cabin-class-travellers-popover\"]/div/div/div[1]/div/button[2]" ) ).click ();
        }
        //driver.findElement(By.xpath ( "//*[@id=\"cabin-class-travellers-popover\"]/div/div/div[1]/div/button[2]" )).click ();
        driver.findElement(By.cssSelector ( "[title='Zahl der Kinder erhöhen']")).click ();
        driver.findElement(By.cssSelector ( "[title='Zahl der Kinder erhöhen']")).click ();
        Thread.sleep ( 2000 );
        driver.findElement(By.id ( "children-age-dropdown-0" )).click ();
        driver.findElement(By.id ( "children-age-dropdown-0" )).sendKeys ( "10" );
        Thread.sleep ( 2000 );
        driver.findElement(By.id ( "children-age-dropdown-1" )).click ();
        driver.findElement(By.id ( "children-age-dropdown-1" )).sendKeys ( "7" );
        Thread.sleep ( 2000 );
        driver.findElement(By.xpath ( "//*[@id=\"cabin-class-travellers-popover\"]/footer/button" )).click ();
        Thread.sleep ( 2000 );
        driver.findElement(By.xpath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button")).click ();
        /*destination.click ();
        destination.clear ();
        destination.sendKeys ( "IST" );
        destination.sendKeys ( Keys.ARROW_DOWN );
        destination.sendKeys ( Keys.ENTER);*/
    }
}
