package steps;

import drivers.Drivers;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import navegadores.Navegadores;
import pages.AtivoPage;
import pages.LoginPage;

public class VendaTeste extends Drivers {

	LoginPage loginPage = new LoginPage();
	AtivoPage ativoPage = new AtivoPage();
	Navegadores navegadores = new Navegadores();

	// Vender Ativo
	@Dado("que eu esteja logado {string}")
	public void que_eu_esteja_logado(String url) {
		navegadores.iniciarTeste(url);
		loginPage.paginaLogado();
	}

	@Quando("eu preecho os dados do ativo")
	public void eu_preecho_os_dados_do_ativo() {
		ativoPage.preencherAtivo("GGBR3", "18", "50");
		ativoPage.confirmarAlert();
		ativoPage.confirmarAlert();
		
	}

	@Quando("eu clico vender")
	public void eu_clico_vender() {
		ativoPage.venderAtivo();
		ativoPage.confirmarAlert();
		ativoPage.confirmarAlert();
	

	}

	@Entao("a venda e concluida no homebroker")
	public void a_venda_e_concluida_no_homebroker() {
		ativoPage.saldoIni();
		navegadores.encerrarTeste();

	}
}
