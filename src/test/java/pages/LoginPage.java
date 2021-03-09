package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

/**
 *   autor a.stupin
 */

public class LoginPage {

    public static SelenideElement buttonLogin = $x("//a[starts-with(@href,'https://passport.yandex.ru/auth')]");
    public static SelenideElement inputLogin = $x("//input[@type='text']");
    public static SelenideElement buttonSubmitFromModalWindow = $x("//button[@type='submit']");
    public static SelenideElement inputPassword = $x("//input[@type='password']");
    public static SelenideElement checkListByEmailAuthor = $x("//span[contains(text(), 'Ступин Артур')]");
    public static SelenideElement checkEmailAuthor = $x("//div/span[contains(text(), 'Ступин Артур')]");
    public static SelenideElement checkEmailSubject = $x("//span/div[contains(text(), 'ТЕСТ')]");
    public static SelenideElement checkEmailDescription = $x("//div[contains(text(), 'Тестовое письмо')]");
    public static SelenideElement clickOnUserAvatar = $x("//a[@href='https://passport.yandex.ru']");
    public static SelenideElement clickOnExitAccountButton = $x("//li/a[@aria-label='Выйти из аккаунта']");
    public static SelenideElement checkIfLoginModalWindowExist = $x("//span[contains(text(), 'Войдите, чтобы перейти')]");
}