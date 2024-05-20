package com.exito.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddToCar extends PageObject {



   private final By btnAgregar=By.xpath("//a[@class='button-primary cart-pop-up-warrantyFooter_cartRedirect js-warrantyRedirect-overlay js-sf-go-to-cart js-animateBeforeSend']");
    public By getBtnAgregar(){
        return btnAgregar;

    }

    private final By btnIrACarrito=By.xpath("//button[@class='button-primary js-continue-checkout-button alkosto-cartButton js-animateBeforeSend js-checkSameDayToggle']");

    public By getBtnIrACarrito(){
        return btnIrACarrito;
    }
}
