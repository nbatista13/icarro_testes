package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BaseTests {

	protected static WebDriver driver;
	protected HomePage homePage;

	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\86\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeEach
	public void carregarPaginaInicial() {
		driver.get("https://www.icarros.com.br/principal/index.jsp");
		homePage = new HomePage(driver);
	}

	@AfterAll
	public static void finalizar() {
		driver.quit();
	}

}
