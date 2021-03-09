package cases;

import com.codeborne.selenide.Condition;
import common.BaseTest;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static pages.LoginPage.*;

/**
 *   autor a.stupin
 */

public class LoginPageCases extends BaseTest {

    @Step("Нажатие на кнопку Войти")
    public static void clickOnLoginButton () {
        $(buttonLogin).click();
        logger.info("Нажали на кнопку Войти");
    }
    @Step("Ввод Email в поле")
    public static void inputUserEmail () {
        $(inputLogin).sendKeys(cfg.LOGIN());
        logger.info("Ввели почтовый адрес пользователя");
    }
    @Step("Нажатие на кнопку Войти из модального окна")
    public static void  clickOnSubmitButtonFromModalWindow () {
        $(buttonSubmitFromModalWindow).click();
        logger.info("Нажали на кнопку войти из модального окна");
    }
    @Step("Ввод пароля в поле")
    public static void inputUserPassword () {
        $(inputPassword).sendKeys(cfg.PASSWORD());
        logger.info("Ввели пароль пользователя");
    }
    @Step("Поиск письма из списка по автору")
    public static void findEmailFromAuthor () {
        $(checkListByEmailAuthor).
                shouldBe(Condition.visible).
                click();
        logger.info("Нашли письмо от введенного автора и открыли его");
    }
    @Step("Проверка письма по Автору / Теме письма / Описанию")
    public static void checkIfEmailAreCorrect () {
        $(checkEmailAuthor).shouldBe(Condition.visible);
        $(checkEmailSubject).shouldBe(Condition.visible);
        $(checkEmailDescription).shouldBe(Condition.visible);
        logger.info("Проверили что автор, содержимое и тема письма идентична заданным значениям");
    }
    @Step("Нажатие на автар пользователя")
    public static void clickOnUserAvatar () {
        $(clickOnUserAvatar).click();
        logger.info("Нажали на кнопку аватарки");
    }
    @Step("Нажатие на кнопку выхода из сервиса")
    public static void clickOnButtonExit () {
        $(clickOnExitAccountButton).click();
        logger.info("Нажали на кнопку выхода из сервиса Яндекса");
    }
    @Step("Проверка что разлогин прошел успешно")
    public static void checkIfLoggedOfCorrect () {
        $(checkIfLoginModalWindowExist).shouldBe(Condition.visible);
        logger.info("Проверили что разлогирование прошло успешно");
    }
}