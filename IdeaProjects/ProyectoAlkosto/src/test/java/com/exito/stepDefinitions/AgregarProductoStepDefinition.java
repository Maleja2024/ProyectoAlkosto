package com.exito.stepDefinitions;

import com.exito.steps.*;
import com.exito.utils.ImplicitWait;
import com.exito.utils.MethodMouse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgregarProductoStepDefinition {

    @Steps
    private HomeSteps homeSteps;
    @Steps
    private ChooseSteps chooseSteps;
    @Steps
    private AddSteps addSteps;

    @Steps
    private MethodSteps methodSteps;

    @Steps
    private ImplicitWait implicitWait;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private CheckSteps checkSteps;


    @Given("ingresar a la pagina web")
    public void ingresarALaPaginaWeb() {
    homeSteps.openUrl();
    }
    @When("ingrese a la pagina web")
    public void ingreseALaPaginaWeb() {
        methodSteps.moverMouse();

    }
    @When("seleccione el menu")
    public void seleccioneElMenu() {
    chooseSteps.categoria();
    }
    @When("busca el producto en la subcategoria")
    public void buscaElProductoEnLaSubcategoria() {
        methodSteps.moverScroll();
    }
    @When("selecciona el prodcuto")
    public void seleccionaElProdcuto() {
    chooseSteps.subCategoria();
    }
    @When("selecciona agregar al carrito")
    public void seleccionaAgregarAlCarrito() {
      addSteps.agregar();
      checkSteps.ValidarProducto();
      implicitWait.esperaImplicita();

    }
    @Then("se visualizara en el carrito de compras")
    public void seVisualizaraEnElCarritoDeCompras() {
    addSteps.iraCarrito();
    implicitWait.esperaImplicita();

    loginSteps.ingresarEmail();
    loginSteps.Continuar();
    implicitWait.esperaImplicita();


    }

}
