package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.ItemPage;
import page.Main;

import java.time.Duration;

public class TestBase {
    WebDriver driver;
    public Main main;
    public ItemPage itemPage;
    public void start(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.whitelistedIps", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        main = PageFactory.initElements(driver, Main.class);
        itemPage = PageFactory.initElements(driver, ItemPage.class);
    }
    public void finish() {
        driver.quit();
    }
}

