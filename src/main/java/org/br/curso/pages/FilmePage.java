package org.br.curso.pages;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.LoggerHelper;

import static com.br.inmetrics.frm.helpers.QueryHelper.get;

import org.openqa.selenium.By;

public class FilmePage extends PageBase {
	

	VirtualElement checkPageFilme = get(By.xpath("//a[text()='Perfil']")),
				   nomeFilme = get(By.xpath("//h1[@itemprop='name']")),
				   btnJaVi = get(By.xpath("//button[@data-status='SN']")),
				   checkSalvamento = get(By.xpath("//button[@class='btn btn-seen btn-seen-main sn active']")),
				   txtComentario = get(By.xpath("//textarea[@placeholder='Deixe um comentário...']")),
				   btnComentar = get(By.xpath("//button[text()='Enviar']"));
	
	LoggerHelper logger = new LoggerHelper(FilmePage.class);
	
	public boolean verificarPaginaFilme() {
		
		logger.info("Verificar se está na página do Filme.");
		
		return elementExists(checkPageFilme);
	}

	public void MarcarComoVisto() throws ElementFindException{
		
		logger.info("Marcando como visto.");
		
		btnJaVi.click();
		
		logger.info(nomeFilme.getText() + " Foi marcado como visto.");
		
		
	}
	
	public void Comentar(String comentario) throws ElementFindException{
			
			logger.info("Postando Comentario");
			
			txtComentario.clear();
			txtComentario.setValue(comentario);
			btnComentar.click();
			
			logger.info("Comentario (" + comentario + ") Adicionado ao Filme :" + nomeFilme.getText());
			
			
		}
	
	public boolean verificarSalvamento() {
	
		logger.info("Verificando Salvamento.");
		
		return elementExists(checkSalvamento);
		
		}

}
