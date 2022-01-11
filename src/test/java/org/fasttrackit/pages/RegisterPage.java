package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
    @FindBy(id = "firstname")
    private WebElementFacade firstnameField;

    @FindBy(id = "middlename")
    private WebElementFacade middlenameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastnameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailaddField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = ".buttons-set button")
    private WebElementFacade registerButton;

    public void setFirstnameField(String firstname){
      typeInto(firstnameField,firstname);
    }

    public void setMiddlenameField(String middlename){
        typeInto(middlenameField,middlename);
    }

    public void setLastnameField(String lastname){
        typeInto(lastnameField,lastname);
    }

    public void setEmailaddField(String email){
        typeInto(emailaddField,email);
    }

    public void setPasswordField(String pass){
        typeInto(passwordField,pass);
    }

    public void setConfirmationField(String confirmation){
        typeInto(confirmationField,confirmation);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }
}
