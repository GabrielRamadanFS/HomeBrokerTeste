package pages;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class AtivoPage extends Drivers {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public String saldoIni() {
		String saldoInicial = driver.findElement(el.saldo).getText();
		return saldoInicial;
	}

	
	public void preencherAtivo(String Ativo, String preco, String quantidade) {

		metodo.escrever(el.ativoSelecionado, Ativo);

		metodo.escrever(el.atPreco, preco);
		metodo.escrever(el.atQuantidade, quantidade);
		metodo.clicar(el.btnComprar);
	}

	public void confirmarAlert() {
		driver.switchTo().alert().accept();

	}

	public void saldoAtualizado() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Saldo Atual: " + saldoIni());
		String saldoEsperado = "R$ 9100,00";
		if (saldoEsperado.equals(saldoIni())) {
			System.out.println("Saldo Correspondente com Compra Efetuada");
		} else {
			Assert.assertEquals("Saldo n�o foi atualizado corretamente", saldoEsperado, saldoIni());
		}

	}

	// Portifolio
	public void verificarPortifolio(String carteiraEsperada) {
		metodo.validarTexto(el.carteira, carteiraEsperada);

	}

	// vender ativo
	public void venderAtivo() {
		metodo.clicar(el.btnVender);
	}

	// logout
	public void logoutUsuario() {
		metodo.clicar(el.btnSair);
	}

	public void logoutConfirmado() {
		assertEquals(driver.getCurrentUrl(), "https://desafio.ui.e2etreinamentos.com.br/hb.html");
	}
}