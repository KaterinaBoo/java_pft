package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver driver) {
        super (driver);
    }
    public void login(GroupData groupData){
        type(By.name("user"), groupData.getUsername());
        type(By.name("pass"), groupData.getPassword());
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

}
