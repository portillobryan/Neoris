package com.co.neoris.task;

import com.co.neoris.interactions.WaitFor;
import com.co.neoris.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.neoris.userinterfaces.ProductsUI.*;

public class complete implements Task {
    ProductModel listProductModel;

    public complete(ProductModel listProductModel) {
        this.listProductModel = listProductModel;
    }

    public static complete purchase(ProductModel listProductModel){
        return Tasks.instrumented(complete.class, listProductModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Click.on(CART));
        actor.attemptsTo(Click.on(BUTTON_CHECKOUT));
        actor.attemptsTo(Enter.theValue(listProductModel.getFirstname()).into(INPUT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(listProductModel.getLastname()).into(INPUT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(listProductModel.getZipcode()).into(INPUT_POSTAL_CODE));
        actor.attemptsTo(Click.on(BUTTON_CONTINUE));
        actor.attemptsTo(Click.on(BUTTON_FINISH));
        actor.attemptsTo(WaitFor.seconds(1));
    }
}
