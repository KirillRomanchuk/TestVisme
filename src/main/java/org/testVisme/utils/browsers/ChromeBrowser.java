package org.testVisme.utils.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;
import java.util.Map;

public class ChromeBrowser extends BaseBrowser {

    ChromeBrowser() {
        ChromeOptions options = setupChromeOptions();
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(options);
    }

    private ChromeOptions setupChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.default_content_setting_values.notifications", 2);  //1 - allow notification, 2 - block notifications, anyway it hides popup window
        options.setExperimentalOption("prefs", prefs);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        options.setPageLoadStrategy(PageLoadStrategy.NONE);

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--allow-file-access-from-files");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--allow-cross-origin-auth-prompt");
        options.addArguments("--allow-file-access");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--test-type");

        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            options.addArguments("--headless");
        }

        return options;
    }
}
