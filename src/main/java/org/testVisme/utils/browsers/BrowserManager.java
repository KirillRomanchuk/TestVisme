package org.testVisme.utils.browsers;

import org.testVisme.core.config.Config;

public class BrowserManager {
    private static BaseBrowser browser;

    private BrowserManager() {

    }

    public static BaseBrowser getBrowser() {
        if (browser == null) {
            new BrowserManager().initDriver();
        }
        return browser;
    }

    private void initDriver() {
        String browserName = Config.browser();

        if (browserName.equalsIgnoreCase("Chrome")) {
            browser = new ChromeBrowser();
            // if we need more browsers variant can add here
        } else {
            browser = new ChromeBrowser();
        }
    }

    public static void quitSession() {
        getBrowser().getDriver().quit();
        browser = null;
    }


}
