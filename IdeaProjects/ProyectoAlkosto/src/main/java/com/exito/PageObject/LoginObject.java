package com.exito.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginObject extends PageObject {


    private final By txtEmail=By.id("j_username");

    public By getTxtEmail(){
        return txtEmail;
    }


    private final By btnContinuar=By.xpath("//button[@class='button-primary js-enabled-btn-continue js-btnAnimationSoftLogin']");

    public By getBtnContinuar(){
        return btnContinuar;
    }


}
