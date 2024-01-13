package com.bdd.web.stepdefinitions;

import com.bdd.web.step.ComprarProductoStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;


import net.thucydides.core.annotations.Steps;
import org.junit.Assert;


public class ComprarProductoStepDef {

    @Steps
    ComprarProductoStep comprarProductoStep = new ComprarProductoStep();

    @Dado("que ingreso a la página SauceDemo")
    public void que_ingreso_a_la_página_sauce_demo() throws InterruptedException {
        comprarProductoStep.abrirPagina();
    }
    @Cuando("el usuario se autentica con {string} y {string}")
    public void el_usuario_se_autentica_con_y(String usuario, String contraseña) {
        comprarProductoStep.loginPagina(usuario, contraseña);
    }
    @Y("agrego dos productos al carrito")
    public void agrego_dos_productos_al_carrito() throws InterruptedException {
        comprarProductoStep.agregarProductosCarrito();
    }
    @Y("visualizo el carrito")
    public void visualizo_el_carrito() throws InterruptedException {
        comprarProductoStep.visualizarCarrito();
    }
    @Y("completo el formulario de compra con el {string} el {string} y {string}")
    public void completoElFormularioDeCompraConElElY(String firstname, String lastname, String postalcode) throws InterruptedException {
        comprarProductoStep.completarCheckout(firstname,lastname,postalcode);
    }
    @Entonces("finalizo la compra")
    public void finalizo_la_compra() throws InterruptedException {
        comprarProductoStep.finalizarCompra();
    }
    @Y("se muestra el mensaje {string}")
    public void se_muestra_el_mensaje(String mensaje) {
        Assert.assertEquals(mensaje,comprarProductoStep.confirmacionCompra());
    }

}
