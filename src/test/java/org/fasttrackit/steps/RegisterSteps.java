package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.RegisterPage;

public class RegisterSteps extends ScenarioSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();
        homePage.clickRegisterButton();
    }

    @Step
    public void enterRegisterCredentials(String firstname,String middlename,String lastname,String email,String pass,String confirmation){
     registerPage.setFirstnameField(firstname);
     registerPage.setMiddlenameField(middlename);
     registerPage.setLastnameField(lastname);
     registerPage.setEmailaddField(email);
     registerPage.setPasswordField(pass);
     registerPage.setConfirmationField(confirmation);
    }

    @Step
    public void clickOnRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void checkUserIsRegistered(String userName){
      myAccountPage.checkUserRegistered(userName);
    }

    @Step
    public void doRegister(String firstname,String middlename,String lastname,String email,String pass,String confirmation){
        navigateToHomePage();
        navigateToRegisterPage();
        enterRegisterCredentials(firstname, middlename, lastname, email, pass, confirmation);
        clickOnRegisterButton();
    }

}
