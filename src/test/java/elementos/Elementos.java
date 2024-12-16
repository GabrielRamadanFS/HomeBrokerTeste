package elementos;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Elementos extends Drivers {
	
	//LoginPAGE
	public By usuario = By.id("username");
	public By senha = By.id("password");
	public By btnLogin = By.id("loginButton");

	//AtivoPAGE
	public By ativoSelecionado = By.xpath("//*[@id='asset']");
	public By atPreco = By.id("price");
	public By atQuantidade = By.id("quantity");
	public By saldo = By.xpath("//*[@id='balance']");
	public By modal = By.xpath("//*[contains(text()='OK')]");
	public By btnComprar = By.xpath("//*[@id='buy-button']");
	public By btnVender =  By.xpath("//*[@id='sell-button']");
	public By btnSair = By.id("logout-button");
	
	
	//Portifolio
	public By carteira = By.xpath("//*[@id='portfolio-table']/tbody/tr");
	
	
}
