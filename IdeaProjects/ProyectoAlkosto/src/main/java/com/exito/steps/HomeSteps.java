package com.exito.steps;

import com.exito.PageObject.HomePageObject;
import com.exito.utils.MethodMouse;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.interactions.Actions;

public class HomeSteps {


    @Page
    private HomePageObject homePage;





    @Step("El usuario abre la url")
    public void openUrl(){
        homePage.openUrl("https://www.alkosto.com/");
    }

    @Step("seleccionar menu")
    public void sendInfo(){
    homePage.getDriver().findElement(homePage.getTxtSearch()).click();
    }



}

