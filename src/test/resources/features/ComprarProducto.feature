#language:es
@AUTOMATIZACION_SAUCEDEMO
  Característica: Flujo de Compra en Pagina SauceDemo

    Esquema del escenario: Comprar productos en la pagina SauceDemo
      Dado que ingreso a la página SauceDemo
      Cuando el usuario se autentica con "<usuario>" y "<contraseña>"
      Y agrego dos productos al carrito
      Y visualizo el carrito
      Y completo el formulario de compra con el "<firstname>" el "<lastname>" y "<postalcode>"
      Entonces finalizo la compra
      Y se muestra el mensaje "Thank you for your order!"

      Ejemplos:
      | usuario       | contraseña   | firstname | lastname    | postalcode |
      | standard_user | secret_sauce | Juan      | Perez Perez | 1000       |