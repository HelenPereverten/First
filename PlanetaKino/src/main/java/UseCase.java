import com.google.common.annotations.VisibleForTesting;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseCase {

    public WebDriver driver;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://planetakino.ua/");
        System.out.println(driver.getTitle());
    }



    @Test
    public void ChangeLocation() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://planetakino.ua/");
        driver.findElement(By.className("city-selector")).click();
        driver.findElement(By.xpath("//*[@id=\"citylist\"]/li[7]/a")).click();

    }


    @Test
    public void SearchMovie() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://planetakino.ua/");
        driver.findElement(By.xpath("//*[@id=\"search\"]/i[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Мосл");

        Thread.sleep(10000);
    }

    @Test
    public void ChooseMovie() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://planetakino.ua/");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/ul/li[1]/a"));


        Thread.sleep(10000);
    }
}