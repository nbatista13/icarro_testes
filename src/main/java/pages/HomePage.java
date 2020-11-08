package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public ListaAnunciosCarroPage acessaLista() {
		// Clicar campo Marca
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]"))
				.click();
		// Selecionar opção Audi
		driver.findElement(By.xpath(
				"/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("Audi");
		driver.findElement(By.xpath("//*[@id=\"buscaForm\"]/div[2]/div[1]/div/div/div/div/div/ul/li[4]/a/span[1]"))
				.click();

		// Selecionar modelo A1
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"))
				.click();
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("A1");
		driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]"))
				.click();
		//Clicando em Buscar
		driver.findElement(By.xpath("//button[contains(text(),'Buscar')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return new ListaAnunciosCarroPage(driver);
	}

}
