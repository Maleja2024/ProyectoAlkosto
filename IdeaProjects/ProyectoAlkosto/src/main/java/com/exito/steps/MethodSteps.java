package com.exito.steps;

import com.exito.PageObject.HomePageObject;
import com.exito.utils.MethodMouse;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.interactions.Actions;

public class MethodSteps {

    @Page
    private HomePageObject homePage;


    @Page

    private MethodMouse methodMouse;

    @Step("mover menu")
    public void moverMouse(){
        Actions action = new Actions(homePage.getDriver());
        action.moveToElement(homePage.getDriver().findElement(methodMouse.getMouseHover())).build().perform();

    }
    @Step("mover scroll")
    public void moverScroll(){
        Actions action = new Actions(homePage.getDriver());
        action.scrollToElement(homePage.getDriver().findElement(methodMouse.getMouseScroll())).build().perform();

    }

}
