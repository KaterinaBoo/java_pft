package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

    private static final String GROUPS = "groups";

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToPage(GROUPS);
        app.getGroupHelper().initGroupCreation("new");
        app.getGroupHelper().initGroupCreation("group_name");
        app.getGroupHelper().fillGroupForm();
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().goToPage(GROUPS);
    }
}
