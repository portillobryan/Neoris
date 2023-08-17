package com.co.neoris.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target FIELD_USERNAME = Target.the("Field Username").located(By.id("user-name"));
    public static final Target FIEL_PASSWORD = Target.the("Field password").located(By.id("password"));
    public static final Target BUTTON_LOGIN = Target.the("Button Login").located(By.id("login-button"));
    public static final Target MESSAGE_PRODUCTS = Target.the("Message Products Success").locatedBy("//span[text()='Products']");

}
