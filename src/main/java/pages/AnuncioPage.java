package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnuncioPage {
	private static WebDriver driver;
	
	private By modeloCarro = By.xpath("//strong[contains(text(),'Audi A1')]");
	private By precoCarro = By.xpath("//h2");

	public AnuncioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String obterModeloCarro() {
		
		return driver.findElement(modeloCarro).getText();
		
	}
	
	public String obterPreco() {
		return driver.findElement(precoCarro).getText();
		
	}

}
