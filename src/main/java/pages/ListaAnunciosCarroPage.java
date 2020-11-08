package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListaAnunciosCarroPage {
	private static WebDriver driver;

	static List<WebElement> listaCarros = new ArrayList();
	private static By carros = By.xpath("//h2[@class='esquerda titulo_anuncio']");
	private static By descricaoCarros = By.xpath("//h2[@class='esquerda titulo_anuncio']");
	private static By precoCarros = By.xpath("//h3[@class='direita preco_anuncio']");

	public ListaAnunciosCarroPage(WebDriver driver) {
		this.driver = driver;
	}

	private static void carregarListaCarros() {
		listaCarros = driver.findElements(carros);

	}

	public static int contarCarros() {
		carregarListaCarros();
		return listaCarros.size();
	}

	public static String obterModeloCarro(int indiceCarro) {

		return driver.findElements(descricaoCarros).get(indiceCarro).getText();

	}

	public static String obterPreco(int indiceCarro) {
		String carroUm = driver.findElements(precoCarros).get(indiceCarro).getText();
		carroUm = carroUm.replace("preço à vista", "");
		return carroUm;

	}

	public static AnuncioPage clicarAnuncio(int indiceCarro) {
		driver.findElements(descricaoCarros).get(indiceCarro).click();
		return new AnuncioPage(driver);

	}

}
