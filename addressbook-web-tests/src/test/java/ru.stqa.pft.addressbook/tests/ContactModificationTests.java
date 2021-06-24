package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() throws InterruptedException{
        app.getNavigationHelper().goToPage("home");
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Learn", "more", "and", "be", "smart", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToPage("home");
    }
}
