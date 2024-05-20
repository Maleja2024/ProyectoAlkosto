package com.exito.steps;

import com.exito.PageObject.AddToCar;
import com.exito.PageObject.ChooseCategoryObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ChooseSteps {

    @Page
    ChooseCategoryObject chooseCategoryObject;

    @Page
    AddToCar addToCar;
    @Step("elegir categoria")
    public void categoria(){
        chooseCategoryObject.getDriver().findElement(chooseCategoryObject.getTxtCategory()).click();

    }
    @Step("Elegir subcategoria")
    public void subCategoria(){
        chooseCategoryObject.getDriver().findElement(chooseCategoryObject.getTxtSubCategory()).click();

}

    @Step("Elegir producto")
    public void carrito(){
        chooseCategoryObject.getDriver().findElement(addToCar.getBtnAgregar()).click();

    }



}
