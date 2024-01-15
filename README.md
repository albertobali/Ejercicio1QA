Requisitos
- Java 11
- Gherkin
- Cucumber
- IDE compatible con Java, como IntelliJ IDEA
- Las dependencias del proyecto se pueden instalar con el comando mvn clean install.

Instrucciones de instalación
- Clona el proyecto desde GitHub. url: https://github.com/albertobali/Ejercicio1QA.git
- Ejecuta el comando mvn clean install para instalar las dependencias.

Instrucciones de ejecución
- Abre el proyecto en tu IDE.
- Ejecuta las pruebas con el siguiente comando:
 * mvn verify -Dcucumber.options="--tags @AUTOMATIZACION_SAUCEDEMO"
- El reporte Serenity se encuentra en la siguiente ruta:
*  /target/site/serenity/index.html

