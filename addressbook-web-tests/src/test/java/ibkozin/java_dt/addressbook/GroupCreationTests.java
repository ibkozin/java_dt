package ibkozin.java_dt.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void GroupCreationTests() {
        gotoGroupPage("groups");
        initGroupCreation();
        fillGroupForm(new GroupData("Igor", "TestHeader", "TestComment"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
