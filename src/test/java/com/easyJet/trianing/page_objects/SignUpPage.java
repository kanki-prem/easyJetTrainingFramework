package com.easyJet.trianing.page_objects;

import com.easyJet.trianing.utils.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends DriverHelpers {

    @FindBy(css = "input[name='uid']")
    private WebElement userNameTextBox;

    @FindBy(css = "input[name='uid']")
    private WebElement passwordTextBox;

    @FindBy(css = "input[value='Create account']")
    private WebElement accountCreateBtn;

    @FindBy(css = ".message")
    private WebElement message;


    public void signUp(String userName, String password) {
        waitForElementToVisible(userNameTextBox).sendKeys(userName);
        waitForElementToVisible(passwordTextBox).sendKeys(password);
        waitForElementToVisible(accountCreateBtn).click();
    }

    public String isAccountCreated() {
        return waitForElementToVisible(message).getText();
    }
}
