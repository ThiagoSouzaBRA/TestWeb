package core;

import static org.junit.Assert.assertTrue;

import frameworkSelenium.core.apoio.ControleAutomacao;
import frameworkSelenium.core.selenium.controleWeb.TelaWeb;

public class Acoes extends TelaWeb{
	
	public boolean EncontrarElemento(String xpath) throws Exception {
		
		return this.verificaExistenciaElemento(xpath);
	
	}
	
	//Clicar em elemento
	public void ClicarElemento(String xpath) {
		this.ClicarElemento(xpath);		
	}

	//Escrever texto em um elemento
	public void Escrever(String txt, String xpath) throws Exception {
		this.obterControleGenerico(xpath).digitarTexto(txt);
	}	
	
}
