package steps;

import drivers.Drivers;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import navegadores.Navegadores;
import pages.AtivoPage;
import pages.LoginPage;

public class CompraTeste extends Drivers {

	LoginPage loginPage = new LoginPage();
	AtivoPage ativoPage = new AtivoPage();
	Navegadores navegadores = new Navegadores();

	// Comprar ativo
	@Dado("que eu esteja na pagina logado {string}")
	public void que_eu_esteja_na_pagina_logado(String url) {
		navegadores.iniciarTeste(url);
		loginPage.paginaLogado();
	}

	@Quando("eu preencho os dados do ativo e clico comprar")
	public void eu_preencho_os_dados_do_ativo() {
		ativoPage.preencherAtivo("GGBR3", "18", "50");
	}

	
	@Quando("eu confirmo o Modal de Confirmacao de Compra")
	public void eu_confirmo_o_modal_de_confirma_o_de_compra() {
		ativoPage.confirmarAlert();
		ativoPage.confirmarAlert();
	
	    
	}

	@Entao("o ativo aparece na minha carteira.")
	public void o_ativo_aparece_na_minha_carteira() throws InterruptedException {
		ativoPage.verificarPortifolio("GGBR3 18,00 50");
		ativoPage.saldoAtualizado();
		navegadores.encerrarTeste();
	}

}
