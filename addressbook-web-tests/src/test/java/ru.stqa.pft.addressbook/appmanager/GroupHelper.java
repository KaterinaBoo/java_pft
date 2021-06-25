package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void fillGroupForm(String name, String header, String footer) {
        type(By.name("group_name"), name);
        type(By.name("group_header"), header);
        type(By.name("group_footer"), footer);
    }

    public void initGroupCreation(String s) {
        driver.findElement(By.name(s)).click();
    }
    public void clickElementByXpath(String s) {
        driver.findElement(By.xpath(s));
    }

    public void submitGroupCreation() {
        click("submit");
    }

    public void deleteSelectedGroups() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        //загрузили все спаны в форму
        List<WebElement> spans = driver.findElement(By.xpath("//*[@id=\"content\"]/form")).findElements(By.tagName("span"));
        List<WebElement> checkboxes = new ArrayList<>();
        //перебрали каждый спан в списке спанов, выгрузили все чекбоксы из каждого спана
        for (WebElement span:spans) {
            checkboxes.addAll(span.findElements(By.tagName("input")));
        }
        //если список не пустой, то кликни на первый чекбокс в списке
      if (!checkboxes.isEmpty()) {
          checkboxes.get(0).click();
      }
      //перебрали весь список чекбоксов, кликнули на нужный нам чекбокс
      for (WebElement checkbox:checkboxes) {
          if (checkbox.getAttribute("title").contains("testtttt")){
              checkbox.click();
              break;
          }
      }
    }

    public void initGroupModification() {
        click("edit");
    }

    public void submitGroupModification() {
        click("update");
    }
}
