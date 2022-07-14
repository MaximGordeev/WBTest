package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("window-size=1200x600");
        //options.setExperimentalOption("useAutomationExtension","False");
        driver = new ChromeDriver(options);
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

