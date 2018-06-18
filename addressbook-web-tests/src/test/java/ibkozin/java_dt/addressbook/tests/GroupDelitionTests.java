package ibkozin.java_dt.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase {

    @Test
    public void testsGroupDelition() {
        app.getGroupHelper().gotoGroupPage("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deliteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();    }

}
