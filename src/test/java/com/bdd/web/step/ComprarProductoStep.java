package com.bdd.web.step;

import com.bdd.web.pages.ComprarProductoPage;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class ComprarProductoStep {

    WebDriver driver;
    String UrlBase = "https://www.saucedemo.com/";
    ComprarProductoPage ComprarProductoPage() {
        return new ComprarProductoPage(driver);
    }

    @Step
    public void abrirPagina() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(UrlBase);
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(3);
    }

    @Step
    public void loginPagina(String user, String pass) {
        ComprarProductoPage().getInputUsuario().sendKeys(user);
        ComprarProductoPage().getInputPassword().sendKeys(pass);
        ComprarProductoPage().submitLogin().click();
    }

    @Step
    public void agregarProductosCarrito() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        ComprarProductoPage().submitAgregarProducto1().click();
        TimeUnit.SECONDS.sleep(3);
        ComprarProductoPage().submitAgregarProducto2().click();
    }

    @Step
    public void visualizarCarrito() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        ComprarProductoPage().clicCarrito().click();
    }

    @Step
    public void completarCheckout(String firstname, String lastname, String postalcode) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        ComprarProductoPage().submitCheckout().click();

        ComprarProductoPage().getInputFirstName().sendKeys(firstname);
        ComprarProductoPage().getInputLastName().sendKeys(lastname);
        ComprarProductoPage().getInputPostalCode().sendKeys(postalcode);

        TimeUnit.SECONDS.sleep(5);
        ComprarProductoPage().submitContinuar().click();

    }

    @Step
    public void finalizarCompra() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        ComprarProductoPage().submitFinishCheckout().click();
    }

    @Step
    public String confirmacionCompra() {
        String mensaje = ComprarProductoPage().checkoutComplete().getText();
        System.out.println(mensaje);
        driver.quit();
        return mensaje;
    }
}