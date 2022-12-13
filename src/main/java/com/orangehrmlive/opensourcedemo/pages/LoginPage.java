package com.orangehrmlive.opensourcedemo.pages;

import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h6[text() = 'Dashboard']")
    WebElement headerTitleDashboard;

    //********************

    public void enterUsername() {
        Reporter.log("Enter user name " + "Admin" + usernameField.getText());
        sendTextToElement(usernameField, "Admin");
    }

    public void enterPassword() {
        Reporter.log("Enter password " + "admin123" + passwordField.getText());
        sendTextToElement(passwordField, "admin123");
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login button " + loginButton.getText());
        clickOnElement(loginButton);
    }

    public String getHeaderTitleDashboard() {
        Reporter.log("Get header title of dashboard " + headerTitleDashboard.getText());
        return getTextFromElement(headerTitleDashboard);

    }
}
