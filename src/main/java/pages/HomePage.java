package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	/*
	 * List<WebElement> listaCarros = new ArrayList(); private By carros =
	 * By.xpath("//h2[@class='esquerda titulo_anuncio']"); private By
	 * descricaoCarros = By.xpath("//h2[@class='esquerda titulo_anuncio']"); private
	 * By precoCarros = By.xpath("//h3[@class='direita preco_anuncio']");
	 */

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public ListaAnunciosCarroPage acessaLista() {
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[1]/div/div/div/div/div/ul/li[4]/a/span[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]"))
				.click();
		driver.findElement(By.xpath("//button[contains(text(),'Buscar')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return new ListaAnunciosCarroPage(driver);
	}

}
