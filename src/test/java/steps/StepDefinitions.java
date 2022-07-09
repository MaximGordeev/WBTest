package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import org.openqa.selenium.By;
import test.TestBase;

public class StepDefinitions extends TestBase {
    @Before
    public void initialization() {
        start();
    }

    @After
    public void teardown() {
        finish();
    }


    @Given("в броузере открыта главная страница WB")
    public void openWBMainPage() {
        main.goTo();
    }

    @When("пользователь вводит ключевое слово и нажимает Enter")
    public void SearchItemInInput() {
        main.SearchItemInSearchInput();

    }

    @And("на экран выводится список продуктов")
    public void itemListOnScreen() {
        main.itemListVisible();
    }

    @And("выбирает категорию Карандаш")
    public void chooseCategoryFromList() {
        main.chooseCategory();
    }

    @And("срок доставки до 3-х дней")
    public void deliveryTime() {
        main.chooseDeliveryTime();
    }

    @And("скидка от 10 %")
    public void discountFrom() {
        main.chooseDiscountFrom();
    }

    @And("пользователь выбирает и переходит на страницу 5 поиска")
    public void toFiveSheet() {
        main.chooseDifferentPage();
    }

    @And("выбирает случайный продукт из представленных на странице и нажимает на него открывая карточку продукта")
    public void chooseDifferentItemAndClickThen() {
        main    .chooseItemInList()
                .savePageAddres();
    }

    @And("в броузере открыта карточка продукта")
    public void itemCardIsOpen() {
        main.isThatPageIsThat();
    }

    @And("пользователь кликает на кнопку Добавить в Корзину")
    public void clickAddToCart() {
        main.clickOnBtnAddToCart();
    }

    @And("следом кликает на кнопку Перейти в Корзину")
    public void clickGoToCart() {
        main.clickOnBtnGotoCart();
    }

   @Then("на экране открывается страница Корзины")
    public void наЭкранеОткрываетсяСтраницаКорзины() {

    }


/*     @Дано("в броузере открыта карточка продукта")
    public void вБроузереОткрытаКарточкаПродукта() {
    }

    @Когда("пользователь кликает на кнопку Добавить в Корзину")
    public void пользовательКликаетНаКнопкуДобавитьВКорзину() {
    }

    @И("следом кликает на кнопку Перейти в Корзину")
    public void следомКликаетНаКнопкуПерейтиВКорзину() {
    }

    @Тогда("на экране открывается страница Корзины")
    public void наЭкранеОткрываетсяСтраницаКорзины() {
    }

    @Дано("в броузере открыта страница Корзины и добавлен продукт")
    public void вБроузереОткрытаСтраницаКорзиныИДобавленПродукт() {
    }

    @И("пользователь кликает на количество продукта и изменяет кол-во на {int}")
    public void пользовательКликаетНаКоличествоПродуктаИИзменяетКолВоНа(int arg0) {
    }

    @И("количество продуктов в корзине изменяется на {int}")
    public void количествоПродуктовВКорзинеИзменяетсяНа(int arg0) {
    }

    @И("пользователь кликает {int} раза на кнопку уменьшения кол-ва продукта и кол-во уменьшается на {int}")
    public void пользовательКликаетРазаНаКнопкуУменьшенияКолВаПродуктаИКолВоУменьшаетсяНа(int arg0, int arg1) {
    }

    @Когда("пользователь нажимает на кнопку удалить продукт")
    public void пользовательНажимаетНаКнопкуУдалитьПродукт() {
    }

    @Тогда("продукт удаляеется из Корзины")
    public void продуктУдаляеетсяИзКорзины() {
    }*/
}
