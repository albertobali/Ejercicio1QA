package com.bdd.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComprarProductoPage {

    WebDriver driver;

    public ComprarProductoPage(WebDriver driver){
        this.driver = driver;
    }

    By txtUsuario = By.xpath("//input[@id='user-name']");
    By txtPassword = By.xpath("//input[@id='password']");
    By buttonLogin = By.xpath("//input[@id='login-button']");

    By buttonAgregarProducto1 = By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    By buttonAgregarProducto2 = By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']");

    By verCarrito = By.xpath("//div[@id='shopping_cart_container']/a");

    By buttonCheckout = By.xpath("//button[@name='checkout']");
    By txtFirstName = By.xpath("//input[@name='firstName']");
    By txtLastName = By.xpath("//input[@name='lastName']");
    By txtPostalCode = By.xpath("//input[@name='postalCode']");
    By buttonContinuar = By.xpath("//input[@name='continue']");

    By buttonFinish = By.xpath("//button[@name='finish']");
    By mensajeConfirmacion = By.xpath("//div[@id='checkout_complete_container']/h2");

    public WebElement getInputUsuario() {
        return driver.findElement(txtUsuario);
    }
    public WebElement getInputPassword() {
        return driver.findElement(txtPassword);
    }
    public WebElement submitLogin() {
        return driver.findElement(buttonLogin);
    }

    public WebElement submitAgregarProducto1() {return driver.findElement(buttonAgregarProducto1);}
    public WebElement submitAgregarProducto2() {return driver.findElement(buttonAgregarProducto2);}

    public WebElement clicCarrito() {return driver.findElement(verCarrito);}

    public WebElement submitCheckout() {return driver.findElement(buttonCheckout);}
    public WebElement getInputFirstName() {return driver.findElement(txtFirstName);}
    public WebElement getInputLastName() {return driver.findElement(txtLastName);}
    public WebElement getInputPostalCode() {return driver.findElement(txtPostalCode);}
    public WebElement submitContinuar() {return driver.findElement(buttonContinuar);}

    public WebElement submitFinishCheckout() {return driver.findElement(buttonFinish);}
    public WebElement checkoutComplete() {return driver.findElement(mensajeConfirmacion);}
}
