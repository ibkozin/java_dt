package ibkozin.java_dt.addressbook.tests;

import ibkozin.java_dt.addressbook.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void GroupCreationTests() {
        app.getGroupHelper().gotoGroupPage("groups");
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Igor", "TestHeader", "TestComment"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
