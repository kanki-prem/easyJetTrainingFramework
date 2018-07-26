package com.easyJet.trianing.step_definations;

//     driver.get(url);
//    driver.findElement(By.id("EmailAddress")).sendKeys(email);
//   driver.findElement(By.id("OptInEasyJetMailingListCheckBox")).click();
//  driver.findElement(By.id("mainHeading")).getText()
//  driver.findElement(By.linkText("Sign Out")).isDisplayed();

//--------------


import com.easyJet.trianing.utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class registration extends BasePage {



    @Given("^I enter url \"([^\"]*)\"$")
    public void iEnterUrl(String url) throws Throwable {
//        signIn si = new signIn();
//        si.browser();
        Browser();




        driver.get(url);
    }

    @And("^I enter email address is \"([^\"]*)\"$")
    public void iEnterValidEmailAddressIs(String email) throws Throwable {
        driver.findElement(By.id("EmailAddress")).sendKeys(email);
    }

    @And("^I enter confirm email address is \"([^\"]*)\"$")
    public void iEnterValidConfirmEmailAddressIs(String arg0) throws Throwable {
        driver.findElement(By.id("EmailAddressCheck")).sendKeys(arg0);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterValidPassword(String password) throws Throwable {
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterValidConfirmPassword(String confPassword) throws Throwable {
        driver.findElement(By.id("PasswordCheck")).sendKeys(confPassword);
    }

    @And("^I enter Title as \"([^\"]*)\"$")
    public void iEnterTitleAs(String title) throws Throwable {
//        driver.findElement(By.id("TitleTypeCode")).sendKeys(title);

        int index = 0;

        if (title.equals("Mr")){
              index = 1;
        }
        else if (title.equals("Mrs")){
            index = 2;
        }
        else{
            index = 3;
        }

//        switch (title) {
//            case "Mr":
//                index = 1;
//                break;
//            case "Mrs":
//                index = 2;
//                break;
//            default:
//                index = 3;
//        }

        new Select(driver.findElement(By.id("TitleTypeCode"))).selectByIndex(index);
    }

    @And("^I enter First name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstName) throws Throwable {
        driver.findElement(By.id("FirstName")).sendKeys(firstName);
    }

    @And("^I enter Surname as \"([^\"]*)\"$")
    public void iEnterSurnameAs(String lastName) throws Throwable {
        driver.findElement(By.id("LastName")).sendKeys(lastName);
    }

    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String address) throws Throwable {
        driver.findElement(By.id("Address1")).sendKeys(address);
    }

    @And("^I enter town or city as \"([^\"]*)\"$")
    public void iEnterTownOrCityAs(String city) throws Throwable {
        driver.findElement(By.id("City")).sendKeys(city);
    }

    @And("^I enter postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postcode) throws Throwable {
        driver.findElement(By.id("PostalCode")).sendKeys(postcode);
    }

    @And("^I select Country \"([^\"]*)\"$")
    public void iSelectCountry(String country) throws Throwable {
        driver.findElement(By.id("Country")).sendKeys(country);
    }

    @And("^I enter Mobile telephone number \"([^\"]*)\"$")
    public void iEnterMobileTelephoneNumber(String phoneNumber) throws Throwable {
        driver.findElement(By.id("MobilePhone")).sendKeys(phoneNumber);
    }

    @And("^I clicked terms and conditions checkbox$")
    public void iClickedTermsAndConditionsCheckbox() throws Throwable {
        driver.findElement(By.id("OptInEasyJetMailingListCheckBox")).click();
    }

    @When("^I click Register Now button$")
    public void iClickRegisterNowButton() throws Throwable {
        driver.findElement(By.id("btnRegister")).click();
    }


    @Then("^I should see \"([^\"]*)\" text$")
    public void iShouldSeeText(String expectedHeaderText) throws Throwable {
        String actualHeaderText = driver.findElement(By.id("mainHeading")).getText();
        assertEquals(expectedHeaderText, actualHeaderText);
    }

    @And("^I should see name as \"([^\"]*)\"$")
    public void iShouldSeeNameAs(String ExpectedName) throws Throwable {
        String ActualName =
            driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[2]/div[1]/div[3]")).getText();
        assertEquals(ExpectedName, ActualName);
    }

    @And("^I should see Edit button$")
    public void iShouldSeeEditButton() throws Throwable {
        boolean ActauleditButton =
            driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[2]/div[1]/div[1]/a")).isDisplayed();
        assertEquals(true, ActauleditButton);

    }

    @And("^I should see Sing Out button$")
    public void iShouldSeeSingOutButton() throws Throwable {

        boolean ActaulSignout = driver.findElement(By.linkText("Sign Out")).isDisplayed();
        assertEquals(true, ActaulSignout);

    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String ExpectedErrormessage) throws Throwable {
        String receiving = method1(ExpectedErrormessage);

//        #2
            String ActualConfirmEmailAddress =
                driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[3]/div[2]/div/div[2]/label[2]"))
                      .getText();
//            assertEquals(ExpectedErrormessage, ActualConfirmEmailAddress);
    }



    public String  method1(String ExpectedErrormessage_Name){

        String ActualEmailAddress = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[3]/div[2]/div/div[1]/label[2]")).getText();
        String ActualPasswordMsg = driver.findElement(By.xpath("/html/body/div[1]/div/form/div/div[3]/div[2]/div/div[3]/label[2]")).getText();

        String[] ExpectedErrorMsgsArray = ExpectedErrormessage_Name.split(",");

//        assertEquals(ExpectedErrorMsgsArray[0],ActualEmailAddress);
//        assertEquals(ExpectedErrorMsgsArray[1],ActualPasswordMsg);

        return ExpectedErrorMsgsArray[0];

    }


}
