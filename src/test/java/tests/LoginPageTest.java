package tests;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import common.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static cases.LoginPageCases.*;
import static common.URL.openYandexMail;

/**
 *   autor a.stupin
 */

@ExtendWith({ScreenShooterExtension.class})
@Epic("Проверка выполнения технического задания")
public class LoginPageTest extends BaseTest {

    @Feature("Тестирование проверки содержимого Email письма")
    @Test
    @Description("Выполнение логина пользователя с последующей проверкой содержимого письма")
    public void checkEmailIncludes () {
        openYandexMail();
        clickOnLoginButton();
        inputUserEmail();
        clickOnSubmitButtonFromModalWindow();
        inputUserPassword();
        clickOnSubmitButtonFromModalWindow();
        findEmailFromAuthor();
        checkIfEmailAreCorrect();
        clickOnUserAvatar();
        clickOnButtonExit();
        checkIfLoggedOfCorrect();
    }
}