package org.br.curso.pages;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.LoggerHelper;

import static com.br.inmetrics.frm.helpers.QueryHelper.get;

import org.openqa.selenium.By;

public class LoginPage extends PageBase {

	
	VirtualElement txtEmail = get(By.xpath("//input[@id='id_username']")),
			   txtPassword = get(By.xpath("//input[@id='id_password']")),
			   btnLogin = get(By.xpath("//*[@id='body_wrapper']/div[1]/div/div/div[1]/form/button")),
			   checkLogin = get(By.xpath("//h1[text()='Login']"));
	
	public boolean verificarPaginaLogin() {
				logger.info("Verificação da Existencia da Página de Login");
				return elementExists(checkLogin);
	}

	public void preencherDados(String email, String senha) throws ElementFindException, InterruptedException {
		
				txtEmail.setValue(email);
				txtPassword.setValue(senha);
				
				logger.info("Preenchimento de Informações ->  Email: (" + email +"), senha : (" + senha + ")");
				
				
				btnLogin.click();
	}
	
}
