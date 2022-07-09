package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage{


    //String SITE_URL = PC_URL;
    public ItemPage(WebDriver driver) {
        super(driver);
    }
    //public String xPathToBtn = "//button[@class='btn-main']";
    public ItemPage isThatPageIsThat() {

        System.out.println(PC_URL);
        //driver.get(PC_URL);
        isElementDisplayed(By.xpath("//button[@class='btn-main']"));
        return this;
    }
    public ItemPage clickOnBtnAddToCart() {
        click(By.xpath("//button[@class='btn-main']"));
        return this;
    }
    public ItemPage clickOnBtnGotoCart() {
        click(By.xpath("//a[text()='        Перейти в корзину    ']"));
        return this;
    }
}
