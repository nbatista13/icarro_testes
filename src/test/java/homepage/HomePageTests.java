package homepage;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import base.BaseTests;
import pages.AnuncioPage;
import pages.ListaAnunciosCarroPage;
import suporte.Generator;
import suporte.Screenshot;

public class HomePageTests extends BaseTests {

	@Test
	public void testConsultarCarrosMesmaMarcaModelo_maisDeTresCarrosUsados() {
		carregarPaginaInicial();
		homePage.acessaLista();
		assertThat(ListaAnunciosCarroPage.contarCarros(), is(20));
		Screenshot.print(driver, "C:\\Users\\Estudo\\evidencia\\ValidaQtdLista\\" + Generator.dataHoraParaArquivo()
		+ "testValidarDetalhesDoPrimeiroCarro_ModeloValorIguais" + ".png");

	}

	@Test
	public void testValidarDetalhesDoPrimeiroCarro_ModeloValorIguais() {
		homePage.acessaLista();

		Screenshot.print(driver, "C:\\Users\\Estudo\\evidencia\\ValidaCarroUm\\" + Generator.dataHoraParaArquivo()
				+ "testValidarDetalhesDoPrimeiroCarro_ModeloValorIguais" + ".png");

		ListaAnunciosCarroPage.contarCarros();
		int indiceCarro = 0;

		String modeloCarroLista = ListaAnunciosCarroPage.obterModeloCarro(indiceCarro);
		String precoLista = ListaAnunciosCarroPage.obterPreco(indiceCarro);

		AnuncioPage anuncioPage = ListaAnunciosCarroPage.clicarAnuncio(indiceCarro);

		String modeloCarro_AnuncioPage = anuncioPage.obterModeloCarro();
		String precoCarro_AnuncioPage = anuncioPage.obterPreco();

		assertThat(modeloCarroLista, CoreMatchers.containsString(modeloCarro_AnuncioPage));
		assertThat(precoLista, CoreMatchers.containsString(precoCarro_AnuncioPage));

		Screenshot.print(driver, "C:\\Users\\Estudo\\evidencia\\ValidaCarroUm\\" + Generator.dataHoraParaArquivo()
				+ "testValidarDetalhesDoPrimeiroCarro_ModeloValorIguais" + ".png");

	}

	@Test
	public void testValidarDetalhesDoSegundoCarro_ModeloValorIguais() {
		homePage.acessaLista();

		Screenshot.print(driver, "C:\\Users\\Estudo\\evidencia\\ValidaCarroDois\\" + Generator.dataHoraParaArquivo()
				+ "testValidarDetalhesDoSegundoCarro_ModeloValorIguais" + ".png");

		ListaAnunciosCarroPage.contarCarros();
		int indiceCarroDois = 1;

		String modeloCarroDoisLista = ListaAnunciosCarroPage.obterModeloCarro(indiceCarroDois);
		String precoDoisLista = ListaAnunciosCarroPage.obterPreco(indiceCarroDois);

		AnuncioPage anuncioPage = ListaAnunciosCarroPage.clicarAnuncio(indiceCarroDois);
		String modeloCarroDois_AnuncioPage = anuncioPage.obterModeloCarro();
		String precoCarroDois_AnuncioPage = anuncioPage.obterPreco();

		assertThat(modeloCarroDoisLista, CoreMatchers.containsString(modeloCarroDois_AnuncioPage));
		assertThat(precoDoisLista, CoreMatchers.containsString(precoCarroDois_AnuncioPage));

		Screenshot.print(driver, "C:\\Users\\Estudo\\evidencia\\ValidaCarroDois\\" + Generator.dataHoraParaArquivo()
				+ "testValidarDetalhesDoSegundoCarro_ModeloValorIguais" + ".png");

	}

}
