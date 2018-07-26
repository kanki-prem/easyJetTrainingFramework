package com.easyJet.trianing.page_objects;

import com.easyJet.trianing.utils.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverHelpers {

    @FindBy(linkText = "Sign up")
    private WebElement signUpLnk;

    @FindBy(linkText = "New Snippet")
    private WebElement newSnippetLnk;

    @FindBy(linkText = "Home")
    private WebElement homeLink;

    @FindBy(linkText = "Upload")
    private WebElement uploadLink;

    public void navigateToSignUp() {
        waitForElementToVisible(signUpLnk).click();
    }

    public void navigateToNewSnippet() {
        waitForElementToVisible(homeLink).click();
        waitForElementToVisible(newSnippetLnk).click();
    }

    public void naviageToUpload(){
        waitForElementToVisible(homeLink).click();
        waitForElementToVisible(uploadLink).click();
    }
}
