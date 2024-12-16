package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import drivers.Drivers;

public class Metodos extends Drivers {

	/**
	 * Clicar em um elemento passando o By
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	/**
	 * Escrever em um elemento
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	/**
	 * Informar o texto esperado para ser validado com o texto capturado
	 * 
	 * @param elemento
	 * @param textoEsperado
	 */
	public void validarTexto(By elemento, String textoEsperado) {
		assertEquals(textoEsperado, driver.findElement(elemento).getText());
	}
}
