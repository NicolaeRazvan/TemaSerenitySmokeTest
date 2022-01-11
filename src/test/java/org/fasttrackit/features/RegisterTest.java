package org.fasttrackit.features;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Test;
public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidCredentials(){
        loginSteps.navigateToHomePage();
        registerSteps.navigateToRegisterPage();
        registerSteps.enterRegisterCredentials("Nicolae","C","Razvan","email20@gmail.com","parola","parola");
        registerSteps.clickOnRegisterButton();
        registerSteps.checkUserIsRegistered("Nicolae C Razvan");
    }

}
