package com.co.neoris.stepdefinitions;

import com.co.neoris.drivers.Driver;
import com.co.neoris.models.UserLoginModel;
import com.co.neoris.questions.TheElement;
import com.co.neoris.task.Login;
import com.co.neoris.utils.constants.General;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.neoris.userinterfaces.LoginUI.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserLoginStepDefinitions {
    @Given("^the user enter main page$")
    public void theUserEnterMainPage() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.inThePage(General.URL)));
    }

    @When("^the user fills the fields to login with success$")
    public void theUserFillsTheFieldsToLoginWithSuccess(List<UserLoginModel> ListUserLoginModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.user(ListUserLoginModel.get(0)));

    }
    @Then("^the user successfully login$")
    public void theUserSuccessfullyLogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheElement.exists(MESSAGE_PRODUCTS)));
    }
}
