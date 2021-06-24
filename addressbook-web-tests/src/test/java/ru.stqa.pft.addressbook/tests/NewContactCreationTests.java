package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.appmanager.ContactHelper;
import ru.stqa.pft.addressbook.model.ContactData;

public class NewContactCreationTests extends TestBase {

  @Test
  public void testNewContactCreationTests() throws Exception {
    app.getNavigationHelper().goToPage("add new");
    app.getContactHelper().fillContactForm(new ContactData("Ivan", "Peter", "Ivanov", "iv", "ivTitle", "test1"), true);
    app.getContactHelper().submitContactCreation("(//input[@name='submit'])[2]");
    app.getNavigationHelper().goToPage("home");
    app.getNavigationHelper().goToPage("Logout");
  }

}
