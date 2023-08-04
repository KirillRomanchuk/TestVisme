package org.testVisme.pages;

import org.openqa.selenium.By;
import org.testVisme.components.BaseComponent;
import org.testVisme.components.InputComponent;

public class LoginPage extends BasePage {
    protected final String EMAIL = "login";
    protected final String PASSWORD = "password";
    protected final String ERROR_MESSAGE = "error-message";
    protected final String BUTTON_SIGN_IN = ".//button[contains(@class, 'login')]";
    protected final String BUTTON_LOGIN_WITH_GOOGLE = "google-login";
    protected final String BUTTON_LOGIN_WITH_FACEBOOK = "facebook-login";

    public String getPageUrlPattern() {
        return "^https?:\\/\\/.+\\/login";
    }

    public InputComponent inputEmail() {
        return new InputComponent().init(By.className(EMAIL), this.webElement);
    }

    public InputComponent inputPassword() {
        return new InputComponent().init(By.className(PASSWORD), this.webElement);
    }

    public BaseComponent buttonSignIn() {
        return new BaseComponent().init(By.xpath(BUTTON_SIGN_IN), this.webElement);
    }
    public BaseComponent errorMessage() {
        return new BaseComponent().init(By.className(ERROR_MESSAGE), this.webElement);
    }

    public BaseComponent buttonLoginWithGoogle() {
        return new BaseComponent().init(By.className(BUTTON_LOGIN_WITH_GOOGLE), this.webElement);
    }

    public BaseComponent buttonLoginWithFacebook() {
        return new BaseComponent().init(By.className(BUTTON_LOGIN_WITH_FACEBOOK), this.webElement);
    }
}
