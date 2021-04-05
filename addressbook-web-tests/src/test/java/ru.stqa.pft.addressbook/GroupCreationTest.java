package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        goToGroupPage();
        initGroupCreation("new");
        initGroupCreation("group_name");
        fillGroupForm();
        initGroupCreation("submit");
        goToGroupPage();
    }
}
