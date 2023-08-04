import org.testVisme.BaseWebSite;
import org.testVisme.WebSiteManager;
import org.testVisme.core.config.data.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testVisme.core.config.Config.*;

public class Hooks {
    protected static BaseWebSite site;
    protected static User user;
    protected static User notRegUser;

    @BeforeClass
    public static void beforeTest() {
        WebSiteManager.getSite(baseUrl());
        site = WebSiteManager.getSiteInstance();
        user = user();
        notRegUser = notRegUser();
    }

    @AfterClass
    public static void afterTest() {
        WebSiteManager.resetSite();
    }
}
