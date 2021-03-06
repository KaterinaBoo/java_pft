package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToPage(String s) {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
        driver.findElement(By.linkText(s)).click();
    }
    public void goToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        driver.findElement(By.linkText("home")).click();
    }
}
