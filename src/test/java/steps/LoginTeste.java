package steps;

import drivers.Drivers;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import navegadores.Navegadores;
import pages.AtivoPage;
import pages.LoginPage;

public class LoginTeste extends Drivers {

	LoginPage loginPage = new LoginPage();
	AtivoPage ativoPage = new AtivoPage();
	Navegadores navegadores = new Navegadores();

	// Login
	@Dado("que eu acesso o site {string}")
	public void que_eu_acesso_o_site(String url) {
		navegadores.iniciarTeste(url);
	}

	@Quando("eu preencho os dados e clico no botao login")
	public void eu_preencho_os_dados_do_usuario_e_senha() {
		loginPage.preencherUsuario("e2etreinamentos", "e2e@123");
	}

	@Entao("eu sou direcionado para a pagina logado")
	public void eu_sou_direcionado_para_a_pagina_logado() {
		loginPage.paginaLogado();
		navegadores.encerrarTeste();
	}

}
