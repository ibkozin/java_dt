package ibkozin.java_dt.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase {

    @Test
    public void testsGroupDelition() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deliteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();    }

}
