import org.testVisme.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPositiveLoginCase extends LoginPageGeneral {

    @Test(priority = 1)
    public void login() {
        LoginPage loginPage = site.loginPage();

        clearAndFillEmailPassword(user.getEmail(), user.getPassword());
        loginPage.buttonSignIn().click();
    }

    @Test(priority = 2)
    public void homePageIsOpened() {
        Assert.assertTrue(site.homePage().pageIsOpened(), "The home page did not open!");
    }
}
