package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
  //private static final String GROUPS = "groups";

  @Test
  public void testGroupDeletion () throws Exception {
    app.getNavigationHelper().goToPage("add new");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().goToHomePage();
  }

}
