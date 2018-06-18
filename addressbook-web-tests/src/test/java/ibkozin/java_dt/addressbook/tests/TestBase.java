package ibkozin.java_dt.addressbook.tests;

import ibkozin.java_dt.addressbook.appmanager.AplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {

    protected final AplicationManager app = new AplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
