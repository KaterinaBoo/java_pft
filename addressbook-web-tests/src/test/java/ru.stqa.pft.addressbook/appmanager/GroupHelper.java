package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void fillGroupForm() {
        type(By.name("group_name"), "test1");
        type(By.name("group_header"), "test2");
        type(By.name("group_footer"), "test3");
    }

    public void initGroupCreation(String s) {
        driver.findElement(By.name(s)).click();
    }

    public void submitGroupCreation() {
        click("submit");
    }

    public void deleteSelectedGroups() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }

    public void initGroupModification() {
        click("edit");
    }

    public void submitGroupModification() {
        click("update");
    }
}
