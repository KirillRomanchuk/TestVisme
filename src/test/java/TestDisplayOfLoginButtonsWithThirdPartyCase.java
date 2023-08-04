import org.testVisme.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestDisplayOfLoginButtonsWithThirdPartyCase extends LoginPageGeneral {

    @Test(priority = 1)
    public void displayButtonLoginFacebook() {
        LoginPage loginPage = site.loginPage();

        Assert.assertTrue(loginPage.buttonLoginWithFacebook().isDisplayed(), "Facebook login button is not displayed");
    }

    @Test(priority = 2)
    public void displayButtonLoginGoogle() {
        LoginPage loginPage = site.loginPage();

        Assert.assertTrue(loginPage.buttonLoginWithGoogle().isDisplayed(), "Google login button is not displayed");
    }
}
