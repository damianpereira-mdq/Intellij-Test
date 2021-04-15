package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage {

    private WebDriver driver;

    private By accountSections =By.cssSelector("div#center_column span");

    // Constructor
    public AccountsPage (WebDriver driver) {
        this.driver = driver;
    }

    public String getAccountsPageTitle () {

        return driver.getTitle();
    }

    public int getAccountSectionCount () {
        return driver.findElements(accountSections).size();
    }

    public List<String> getAccountSectionList () {

        List<String> accountsList = new ArrayList<>();
        List<WebElement> accountHeaderList = driver.findElements(accountSections);

        for (WebElement e : accountHeaderList) {
            String text = e.getText();
            System.out.println(text);
            accountsList.add(text);
        }

        return accountsList;

    }

}
