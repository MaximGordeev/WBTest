package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Main extends BasePage {
    String SITE_URL = "https://www.wildberries.ru";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL);
        return this;
    }
    public Main SearchItemInSearchInput() {
        writeText(By.xpath("//input[@id='searchInput']"), "акварельный карандаш\n");
        return this;
    }
    public Main itemListVisible() {
        isElementDisplayed(By.xpath("//h1[text()='По запросу «акварельный карандаш» найдено']"));
        return this;
    }
    public Main chooseCategory() {
        click(By.xpath("//label[contains(text(),'Карандаш')]"));
        return this;
    }
    public Main chooseDeliveryTime() {
        click(By.xpath("//span[text()='до 3 дней']"));
        return this;
    }
    public Main chooseDiscountFrom() {
        click(By.xpath("//span[text()='от 10% и выше']"));
        return this;
    }
    public Main chooseDifferentPage() {
        click(By.xpath("//a[text()='5']"));
        return this;
    }
    public Main chooseItemInList() {
        сhooseRandomAndClick(By.xpath("//div[@class='product-card__wrapper']/.."));
        return this;
    }
    public Main savePageAddres() {
        saveThisShit(By.xpath("//a[@class = 'product-line__name']"));
        return this;
    }
    public Main isThatPageIsThat() {

        System.out.println(PC_URL+"    good");
        //driver.get(PC_URL);
        //isElementDisplayed(By.xpath("//button[@class='btn-main']"));
        return this;
    }
    public Main clickOnBtnAddToCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        moveAndClick(By.xpath("//div[@class='product-page__order-container']/div/button/span[contains(text(),'Добавить')]"));
        return this;
    }
    public Main clickOnBtnGotoCart() {
        click(By.xpath("//a[text()='        Перейти в корзину    ']"));
        return this;
    }

}
