package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css ="[title='Search']")
    private WebElementFacade searchIcon;

    @FindBy(css = "[title=\"Register\"]")
    private WebElementFacade registerButton;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public void clickRegisterButton(){clickOn(registerButton);}


}
