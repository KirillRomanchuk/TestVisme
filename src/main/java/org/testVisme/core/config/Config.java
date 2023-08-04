package org.testVisme.core.config;

import org.aeonbits.owner.ConfigFactory;
import org.testVisme.core.config.data.User;

public class Config {
    private static final WebConfig webConfig = ConfigFactory.create(WebConfig.class);

    private Config() {

    }

    public static String browser() {
        return webConfig.browser();
    }

    public static String baseUrl() {
        return webConfig.baseUrl();
    }

    public static User user() {
        return webConfig.user();
    }

    public static User notRegUser() {
        return webConfig.notRegUser();
    }
}
