import org.testVisme.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNotFillEmailOrPasswordCase extends LoginPageGeneral {

    @Parameters({"errNoEmail"})
    @Test(priority = 1)
    public void notFillEmail(String expectedErrorMessage) {
        LoginPage loginPage = site.loginPage();
        clearAndFillEmailPassword("", user.getPassword());
        loginPage.buttonSignIn().click();

        checkErrorMessage(loginPage.errorMessage().getText(), expectedErrorMessage);
    }

    @Parameters({"errNoPassword"})
    @Test(priority = 2)
    public void notFillPassword(String expectedErrorMessage) {
        LoginPage loginPage = site.loginPage();
        clearAndFillEmailPassword(user.getEmail(), "");
        loginPage.buttonSignIn().click();

        checkErrorMessage(loginPage.errorMessage().getText(), expectedErrorMessage);
    }
}
