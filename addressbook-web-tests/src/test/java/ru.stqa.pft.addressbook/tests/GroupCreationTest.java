package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

    //private static final String GROUPS = "groups";

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToPage("groups");
        app.getGroupHelper().clickElementByXpath("//*[@id=\"content\"]/form/input[1]");
        //app.getGroupHelper().initGroupCreation("new");
        //app.getGroupHelper().initGroupCreation("group_name");
        app.getGroupHelper().fillGroupForm("test1", "test2", "test3");
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().goToHomePage();
    }
}
