package org.br.curso.steps;

import com.br.inmetrics.frm.bdd.DesignSteps;
import com.br.inmetrics.frm.bdd.Step;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.LoggerHelper;

import static com.br.inmetrics.frm.base.DefaultBaseController.getPage_;
import static com.br.inmetrics.frm.helpers.DataTableHelper.getDt_;

import org.br.curso.pages.LoginPage;
import org.br.curso.pages.PerfilPage;
import org.br.curso.pages.EditPage;
import org.br.curso.pages.HomePage;
import org.testng.Assert;

@DesignSteps
public class ProfileStep {

	HomePage  homePage = getPage_(HomePage.class);
	EditPage  editPage = getPage_(EditPage.class);
	PerfilPage perfilPage = getPage_(PerfilPage.class);
	
	LoggerHelper logger = new LoggerHelper(ProfileStep.class);
	
	@Step("Dado que esteja na Página de Usuario")
	public void dado_que_esteja_na_pagina_de_usuario() throws ElementFindException {
	
	logger.info("Verificar se estou na página Home.");
	
	Assert.assertTrue(homePage.verificarPaginaHome());
	
	homePage.clicarBotao_Meu_Perfil();
	}
	
	@Step("Quando estiver na sessão meu perfil")
	public void quando_estiver_na_sessao_meu_perfil() throws ElementFindException, InterruptedException {
	
	logger.info("Verificando se está na página meu perfil.");
	
	Assert.assertTrue(perfilPage.verificarPaginaMeuPerfil());
	
	
	}
	
	@Step("Quando preencher os campos validos")
	public void quando_preencher_os_campos_validos() throws ElementFindException, InterruptedException {
	
	logger.info("Preenchendo campos.");
	
	perfilPage.preencherDados("Eu amo a nataly");
	
	}
	
	@Step("Então deverá ser enviado")
	public void entao_devera_ser_enviado() {
	
	
	}
}
