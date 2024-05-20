package com.exito.steps;

import com.exito.PageObject.LoginObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class LoginSteps {

    @Page
    LoginObject loginObject;


    @Step("Elegir producto")
    public void ingresarEmail(){
        loginObject.getDriver().findElement(loginObject.getTxtEmail()).sendKeys("mrmayrita@gmail.com");

    }

    @Step("Elegir producto")
    public void Continuar(){
        loginObject.getDriver().findElement(loginObject.getBtnContinuar()).click();

    }


}
