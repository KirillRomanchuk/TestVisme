package org.testVisme.pages;

import org.openqa.selenium.By;
import org.testVisme.components.BaseComponent;
import org.testVisme.components.InputComponent;

public class HomePage extends BasePage {
    public String getPageUrlPattern() {
        return "^https?:\\/\\/.+\\/projects\\/own";
    }
}
