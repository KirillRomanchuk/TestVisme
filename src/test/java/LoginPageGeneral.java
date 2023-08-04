import org.testVisme.pages.LoginPage;
import org.testng.Assert;

public class LoginPageGeneral extends Hooks {
    protected void clearAndFillEmailPassword(String email, String password) {
        LoginPage loginPage = site.loginPage();
        loginPage.inputEmail().clear();
        loginPage.inputPassword().clear();

        loginPage.inputEmail().sendKeys(email);
        loginPage.inputPassword().sendKeys(password);
    }

    protected void checkErrorMessage(String actualMessage, String expectedMessage) {
        String message = String.format("The error message is not correct. Actual - '%s', Expected - '%s'"
                , actualMessage, expectedMessage);
        Assert.assertEquals(actualMessage, expectedMessage, message);
    }
}
