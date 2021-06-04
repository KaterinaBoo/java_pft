package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation("new");
        app.getGroupHelper().initGroupCreation("group_name");
        app.getGroupHelper().fillGroupForm();
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().goToGroupPage();
    }
}
