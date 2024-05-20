package com.exito.PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePageObject extends PageObject {



    private final By txtSearch=By.xpath("//a[@title='Electrodomésticos']");

    public By getTxtSearch(){
        return txtSearch;
    }


}
