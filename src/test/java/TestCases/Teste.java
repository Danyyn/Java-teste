package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Utils.GerenciamentoDriver;

public class Teste {
	
	private WebDriver driver;
	GerenciamentoDriver gerenciamentodriver;
	
	@Before
	public void setup() {
	gerenciamentodriver = new GerenciamentoDriver();
	driver = GerenciamentoDriver.browser("chrome");
	
	}
	
	@Test
	public void Teste()  {
		driver.get("https://www.americanas.com.br/");


		
	}
	



	@After
	public void fim() {
	driver.quit();		
		
	}

}