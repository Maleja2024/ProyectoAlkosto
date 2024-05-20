package com.exito.utils;

public class ImplicitWait {

    public void esperaImplicita(){

        try {
            Thread.sleep(5000);

        }catch (InterruptedException e){

            e.printStackTrace(System.out);
        }

    }

}
