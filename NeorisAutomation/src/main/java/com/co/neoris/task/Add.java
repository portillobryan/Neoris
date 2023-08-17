package com.co.neoris.task;

import com.co.neoris.interactions.WaitFor;
import com.co.neoris.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.neoris.userinterfaces.ProductsUI.*;

public class Add implements Task {

    ProductModel listProductModel;

    public Add(ProductModel listProductModel) {
        this.listProductModel = listProductModel;
    }

    public static Add Product(ProductModel listProductModel){
        return Tasks.instrumented(Add.class, listProductModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        //añade el primer producto
        actor.attemptsTo(Click.on(PRODUCT_SELECT.of(listProductModel.getProduct())));
        actor.attemptsTo(Click.on(BUTTON_ADD_CART));

        actor.attemptsTo(Click.on(BUTTON_BACK_TO_PRODUCTS));

        //añade el segundo producto
        actor.attemptsTo(Click.on(PRODUCT_SELECT.of(listProductModel.getProduct2())));
        actor.attemptsTo(Click.on(BUTTON_ADD_CART));

        actor.attemptsTo(WaitFor.seconds(1));
    }
}
