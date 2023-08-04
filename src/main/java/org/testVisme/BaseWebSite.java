package org.testVisme;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testVisme.core.logger.MainLogger;
import org.testVisme.pages.*;
import org.testVisme.utils.Waiters;
import org.testVisme.utils.browsers.BrowserManager;

public class BaseWebSite {
    protected static final Logger logger = MainLogger.logger;
    protected static BaseWebSite site;
    protected WebDriver driver;
    protected final String PAGE = ".//body[*]";

    BaseWebSite() {
        driver = BrowserManager.getBrowser().getDriver();
    }

    public void loadPage(String page) {
        logger.info("Opened URL: " + page);
        driver.get(page);
    }

    public String getCurrentUrl() {
        String url = driver.getCurrentUrl();
        logger.debug(String.format("Current URL is '%s'", url));
        return url;
    }

    public LoginPage loginPage() {
        return new LoginPage()
                .init(By.xpath(PAGE), driver, Waiters.timeout);
    }

    public HomePage homePage() {
        return new HomePage()
                .init(By.xpath(PAGE), driver, Waiters.timeout);
    }
}
