package com.exito.steps;

import com.exito.PageObject.CheckProduct;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class CheckSteps {



    @Page
    CheckProduct checkProduct;

    @Step("Agregar producto")
    public void ValidarProducto(){
        assertTrue(checkProduct.getDriver().findElement(checkProduct.getMsjValidar()).isDisplayed(),"");


    }

}
