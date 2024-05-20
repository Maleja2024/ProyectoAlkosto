package com.exito.steps;

import com.exito.PageObject.AddToCar;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AddSteps {

    @Page
    AddToCar addToCar;

    @Step("Agregar producto")
    public void agregar(){
        addToCar.getDriver().findElement(addToCar.getBtnAgregar()).click();


    }

    @Step("Ir al Carrito")
    public void iraCarrito(){
        addToCar.getDriver().findElement(addToCar.getBtnIrACarrito()).click();

    }
}
