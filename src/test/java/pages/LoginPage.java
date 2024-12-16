package pages;

import static org.junit.Assert.assertEquals;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;


public class LoginPage extends Drivers{
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void preencherUsuario(String usuario, String senha){
		metodo.escrever(el.usuario, usuario);
		metodo.escrever(el.senha, senha);
		metodo.clicar(el.btnLogin);
				
	}
	
	public void paginaLogado() {
		
		assertEquals(driver.getCurrentUrl(), "https://desafio.ui.e2etreinamentos.com.br/home.html");
			}
}
