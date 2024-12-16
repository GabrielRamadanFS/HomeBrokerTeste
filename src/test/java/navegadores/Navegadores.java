package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers {

	public void iniciarTeste(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void encerrarTeste() {
		driver.quit();
	}

}
