package pageObject;

import core.Acoes;
import frameworkSelenium.core.selenium.controleWeb.TelaWeb;

public class SimpleFormDemoPage extends TelaWeb{
	//Criar elemento com XPATH
	
	Acoes acoes = new Acoes();
	
	String boxMensagem = "//*[@id=\"user-message\"]";
	String verificarPagina = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[1]";
	
	public boolean VerificarPagina() throws Exception {
		return acoes.EncontrarElemento(verificarPagina);
	}
	
	public void EscreverMensagem(String mensagem) throws Exception {
		acoes.Escrever(mensagem, boxMensagem);
	}
	
}
