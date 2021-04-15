package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By emailId = By.id("email");
    private By password = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By forgotPwdLink = By.linkText("Forgot your password?");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean forgotPasswordLinkExists() {
        return driver.findElement(forgotPwdLink).isDisplayed();
    }

    public void entersUsername(String username) {
        driver.findElement(emailId).sendKeys(username);
    }

    public void entersPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickOnLogin() {
        driver.findElement(signInButton).click();
    }

    public AccountsPage doLogin (String un, String pw) {
        System.out.println("Loggin in with user: "+un+ "and password: "+ pw);
        driver.findElement(emailId).sendKeys(un);
        driver.findElement(password).sendKeys(pw);
        driver.findElement(signInButton).click();
        return new AccountsPage(driver);
    }

}
