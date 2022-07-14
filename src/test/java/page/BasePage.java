package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(15));
    }
    public String PC_URL = null;

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }


    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public void moveAndClick(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        WebElement element = driver.findElement(elementBy);

        System.out.println(element.isDisplayed());

        Actions actionsButtonClick = new Actions(driver);
        actionsButtonClick.moveToElement(element).click().build().perform();
    }


    public void isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }
    public void сhooseRandomAndClick(By elementBy) {
        //waitVisibility(elementBy);
        List<WebElement> elements = driver.findElements(elementBy);
        assertEquals(elements.size(),100);
        Random random = new Random();
        Integer numberOfElement = random.nextInt(elements.size());
        //System.out.println(elements.get(numberOfElement));
        String xPathString = "//div[@data-card-index='"+numberOfElement+"']";
        String mainPageProductId = driver.findElement(By.xpath(xPathString)).getAttribute("data-popup-nm-id");
        driver.findElement(By.xpath(xPathString)).click();
        String xPathStringToAssertProductId = "//span[@id='productNmId']";
        String itemPageProductId = driver.findElement(By.xpath(xPathStringToAssertProductId)).getText();
        assertEquals(mainPageProductId,itemPageProductId);

    }
    public void saveThisShit(By elementBy) {
        //waitVisibility(elementBy);
        PC_URL = driver.findElement(elementBy).getAttribute("href");
        System.out.println(PC_URL);

    }


    public void waitForFilling(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }

    public void isElementNotDisplayed(By elementBy) {
        assertTrue(driver.findElements(elementBy).isEmpty());
    }



}