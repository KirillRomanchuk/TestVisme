import org.testVisme.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//have problem with recaptcha
public class TestNotCorrectUserPasswordCase extends LoginPageGeneral {

    @Parameters({"errNoCorrectUserPassword"})
    @Test(priority = 1)
    public void userEmailIsNotCorrect(String expectedErrorMessage) {
        LoginPage loginPage = site.loginPage();
        clearAndFillEmailPassword(notRegUser.getEmail(), user.getPassword());
        loginPage.buttonSignIn().click();

        checkErrorMessage(loginPage.errorMessage().getText(), expectedErrorMessage);
    }

    @Parameters({"errNoCorrectUserPassword"})
    @Test(priority = 2)
    public void userPasswordIsNotCorrect(String expectedErrorMessage) {
        LoginPage loginPage = site.loginPage();
        clearAndFillEmailPassword(user.getEmail(), notRegUser.getPassword());
        loginPage.buttonSignIn().click();

        checkErrorMessage(loginPage.errorMessage().getText(), expectedErrorMessage);
    }
}
