package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
    private static final String GROUPS = "groups";

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToPage(GROUPS);
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm();
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToPage(GROUPS);
    }
}
