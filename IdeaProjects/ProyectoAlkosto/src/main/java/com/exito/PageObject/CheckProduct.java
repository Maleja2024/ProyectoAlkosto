package com.exito.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckProduct extends PageObject {

    private final By msjValidar=By.xpath("//div[@class='cart-info']");
    public By getMsjValidar(){
        return msjValidar;

    }

}
