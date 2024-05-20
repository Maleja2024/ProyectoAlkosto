package com.exito.utils;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MethodMouse extends PageObject {

    private final By mouseHover=By.xpath("//a[@title='Electrodomésticos']");
    public By getMouseHover(){
        return mouseHover;

    }
    private final By mouseScroll=By.xpath("//div[@data-id='8806095121130' and @title='Lavadora SAMSUNG Carga Frontal 22 Kilos WF22C6400AP/CO Gris']");
    public By getMouseScroll(){
        return mouseScroll;

    }



}
