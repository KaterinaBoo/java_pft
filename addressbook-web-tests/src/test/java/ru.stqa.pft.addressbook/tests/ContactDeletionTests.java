package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeletion () throws Exception {
        app.getNavigationHelper().goToPage("home");
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.driver.switchTo().alert().accept();
        app.getNavigationHelper().goToPage("home");
    }
}
