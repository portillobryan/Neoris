package com.co.neoris.stepdefinitions;

import com.co.neoris.models.ProductModel;
import com.co.neoris.questions.TheElement;
import com.co.neoris.task.Add;
import com.co.neoris.task.complete;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.neoris.userinterfaces.ProductsUI.TEXT_VALIDATION;

public class AddPurchaseStepDefinitions {
    @When("^the user add with success the products$")
    public void theUserAddWithSuccessTheProducts(List<ProductModel> ListProductModel){
        OnStage.theActorInTheSpotlight().attemptsTo(Add.Product(ListProductModel.get(0)));
    }

    @When("^the user completes the purchase$")
    public void theUserCompletesThePurchase(List<ProductModel> ListProductModel){
        OnStage.theActorInTheSpotlight().attemptsTo(complete.purchase(ListProductModel.get(0)));
    }

    @Then("^the user confirms the purchase$")
    public void theUserConfirmsThePurchase() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheElement.exists(TEXT_VALIDATION)));
    }
}
