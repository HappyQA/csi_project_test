package common;

import com.codeborne.selenide.WebDriverRunner;

import config.ConfigFile;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;

/**
 *   autor a.stupin
 */

public class BaseTest {

    public static Logger logger = LogManager.getLogger(BaseTest.class);
    public static ConfigFile cfg = ConfigFactory.create(ConfigFile.class);

    @BeforeEach
    public void setUp () {
        browser = "chrome";
        startMaximized = false;
        timeout = 15000;
        holdBrowserOpen = true;
        logger.info("Драйвер UP");
    }
    @AfterEach
    public void shutDown () {
        clearBrowserCookies();
        WebDriverRunner.getWebDriver().quit();
        logger.info("Драйвер DOWN");
    }
}