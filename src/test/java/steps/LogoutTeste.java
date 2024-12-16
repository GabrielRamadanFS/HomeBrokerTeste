package steps;

import drivers.Drivers;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import navegadores.Navegadores;
import pages.AtivoPage;
import pages.LoginPage;

public class LogoutTeste extends Drivers {

	LoginPage loginPage = new LoginPage();
	AtivoPage ativoPage = new AtivoPage();
	Navegadores navegadores = new Navegadores();

	// Logout

	@Quando("eu Clicar em Sair")
	public void eu_clicar_em_sair() {
		ativoPage.logoutUsuario();
		ativoPage.confirmarAlert();
	}

	@Entao("eu sou direcionado para a tela incial")
	public void eu_sou_direcionado_para_a_tela_incial() {
		ativoPage.logoutConfirmado();
		navegadores.encerrarTeste();
	}

}
