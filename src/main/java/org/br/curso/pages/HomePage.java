package org.br.curso.pages;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.LoggerHelper;

import static com.br.inmetrics.frm.helpers.QueryHelper.get;

import org.openqa.selenium.By;

public class HomePage extends PageBase {
	
	
		VirtualElement checkHomePage = get(By.xpath("//a[@data-url='/usuarios/notificacoes-mensagens/']")),
					   btnPerfil = get(By.xpath("//b[@class='caret']")),
					   btnMeuPerfil = get(By.xpath("//a[text()='Meu Perfil']")),
					   btnEditarNome = get(By.xpath("//a[text()='Editar Perfil']")),
					   closeWindowAlert = get(By.xpath("//button[@class='close']")),
					   boxFilmeAleatorio = get(By.xpath("//li[@class='span2 movie_list_item']"));
		
		LoggerHelper logger = new LoggerHelper(HomePage.class);
		
		public boolean verificarPaginaHome() {
			
			logger.info("Verificar se está na página HomePage.");
			
			return elementExists(checkHomePage);
		}

		public void clicarBotao__Editar_Perfil() throws ElementFindException {
			closeWindowAlert.click();
			btnPerfil.click();
			btnEditarNome.click();
			
		}
		
		public void clicarBotao_Meu_Perfil() throws ElementFindException {
					closeWindowAlert.click();
					btnPerfil.click();
					btnMeuPerfil.click();
					
				}
		
		public void clicarSelecionar_Filme_Aleatorio() throws ElementFindException {
			boxFilmeAleatorio.click();
			
		}
		
		
		

}
