package com.co.neoris.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsUI {
    public static final Target PRODUCT_SELECT = Target.the("Name Product select").locatedBy("//a[.//div[contains(text(),'{0}')]]");

    public static final Target BUTTON_BACK_TO_PRODUCTS = Target.the("Button Back to products").located(By.id("back-to-products"));
    public static final Target BUTTON_ADD_CART = Target.the("Button Add Cart").locatedBy("//button[contains(text(),'Add to cart')]");
    public static final Target CART = Target.the("Cart check").locatedBy("//a[@class='shopping_cart_link']");
    public static final Target BUTTON_CHECKOUT = Target.the("Button Remove").located(By.id("checkout"));

    public static final Target INPUT_FIRST_NAME = Target.the("INPUT_FIRST_NAME").located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME = Target.the("INPUT_LAST_NAME").located(By.id("last-name"));
    public static final Target INPUT_POSTAL_CODE = Target.the("INPUT_POSTAL_CODE").located(By.id("postal-code"));
    public static final Target BUTTON_FINISH = Target.the("BUTTON_FINISH").located(By.id("finish"));
    public static final Target BUTTON_CONTINUE = Target.the("BUTTON_CONTINUE").located(By.id("continue"));
    public static final Target TEXT_VALIDATION = Target.the("TEXT_VALIDATION").locatedBy("//h2[text()='Thank you for your order!']");

}
