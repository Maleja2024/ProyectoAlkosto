package com.exito.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChooseCategoryObject extends PageObject {

    private final By txtCategory=By.xpath("//a[@class='main-navigation__subcategory__subitem__label js-megamenu-datalayer-product' and @data-name='Lavadoras' ][1]");

    public By getTxtCategory(){
        return txtCategory;
    }

    private final By txtSubCategory=By.xpath("//button[@id='js-add-cart-8806095121130']");

    public By getTxtSubCategory(){
        return txtSubCategory;

    }

    }
