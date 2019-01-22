package core;

import frameworkSelenium.core.apoio.ControleAutomacao;
import frameworkSelenium.core.selenium.controleWeb.componente.ControleWeb;
import frameworkSelenium.core.selenium.controleWeb.componente.Navegador;
//Padrões Genericos
public class Nav {
	
	public void iniciar(String url) throws Exception{
		ControleWeb.determinarNavegador(Navegador.CHROME);		
		ControleWeb.abrirBrowser(url);		
		ControleAutomacao.gravarLogInfo("Iniciando browser no link... " + url, true);
	}

	public void iniciar() throws Exception{
		ControleWeb.determinarNavegador(Navegador.CHROME);
		ControleWeb.abrirBrowser("https://www.seleniumeasy.com/");
	}

	public void fechar(){
		ControleWeb.fecharBrowser();
	}


}
