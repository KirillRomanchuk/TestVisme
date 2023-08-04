package org.testVisme.core.config;

import org.aeonbits.owner.Config;
import org.testVisme.core.config.convertors.UserConverter;
import org.testVisme.core.config.data.User;

import static org.aeonbits.owner.Config.DisableableFeature.PARAMETER_FORMATTING;

@Config.DisableFeature({PARAMETER_FORMATTING})
@Config.Sources("classpath:config.properties")
public interface WebConfig extends Config {
    @Key("browser")
    String browser();

    @Key("baseUrl")
    String baseUrl();

    @Key("user")
    @ConverterClass(UserConverter.class)
    User user();

    @Key("notRegUser")
    @ConverterClass(UserConverter.class)
    User notRegUser();
}
