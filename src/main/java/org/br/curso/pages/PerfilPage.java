package org.br.curso.pages;


import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.LoggerHelper;

import static com.br.inmetrics.frm.helpers.QueryHelper.get;

import org.openqa.selenium.By;

public class PerfilPage extends PageBase {
	
	VirtualElement txtRecado = get(By.xpath("//textarea")),
			   btnEnviar = get(By.xpath("//button[text()='Enviar recado']")),
			   checkPerfil = get(By.xpath("//a[text()='Últimos recados']")),
			   checkEnvio = get(By.xpath("//p[text()='" + txtRecado + "']"));
	
	public boolean verificarPaginaMeuPerfil() {
				logger.info("Verificação da Existencia da Página de Login");
				return elementExists(checkPerfil);
	}

	public void preencherDados(String recado) throws ElementFindException, InterruptedException {
		
				txtRecado.setValue(recado);
				
				logger.info("Preenchimento de Informações ->  Recado: (" + recado +")");
				
				
				btnEnviar.click();
	}

	public boolean verificarEnvio() {
		
		logger.info("Verificação de envio bem sucedido.");
		
		return elementExists(checkEnvio);
	}

}
