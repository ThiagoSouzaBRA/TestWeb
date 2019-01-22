package steps;

import static org.junit.Assert.assertTrue;

import core.Nav;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import frameworkSelenium.core.selenium.controleWeb.TelaInicial;
import pageObject.SimpleFormDemoPage;

public class SimpleFormDemoStep {
	
	Nav nav = new Nav();
	
	String URL = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
	
	SimpleFormDemoPage Page = new SimpleFormDemoPage();

	@Dado("^que estou na pagina Simple Form Demo$")
	public void queEstouNaPaginaSimpleFormDemo() throws Throwable {
		//chamando ações
		
		nav.iniciar(URL);
		
		assertTrue(Page.VerificarPagina());
	    		
	}
	

	@Quando("^preencher o campo Enter Message com a mensagem Treinamento Inmetrics$")
	public void preencherOCampoEnterMessageComAMensagemTreinamentoInmetrics() throws Throwable {
		
		Page.EscreverMensagem("Oi");		
		
	}
	
	@Quando("^clicar em Show Message$")
	public void clicarEmShowMessage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Entao("^devera ser apresentada a mensagem Your Message: Treinamento Inmetrics$")
	public void deveraSerApresentadaAMensagemYourMessageTreinamentoInmetrics() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
