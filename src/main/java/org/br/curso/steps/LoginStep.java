package org.br.curso.steps;

import com.br.inmetrics.frm.bdd.DesignSteps;
import com.br.inmetrics.frm.bdd.Step;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.LoggerHelper;

import static com.br.inmetrics.frm.base.DefaultBaseController.getPage_;
import static com.br.inmetrics.frm.helpers.DataTableHelper.getDt_;

import org.br.curso.pages.LoginPage;
import org.br.curso.pages.HomePage;
import org.testng.Assert;

@DesignSteps
public class LoginStep {
	
	LoginPage loginPage = getPage_(LoginPage.class);
	HomePage  homePage = getPage_(HomePage.class);
	LoggerHelper logger = new LoggerHelper(LoginStep.class);
	
	@Step("Dado que estou na pagina de login")
	public void dado_que_estou_na_pagina_de_login() {
		
		logger.info("Verificar se estou na página de Login.");
		Assert.assertTrue(loginPage.verificarPaginaLogin());
		
	}
	
	@Step("Quando preencher o login com dados válidos")
	public void quando_preencher_o_login_com_dados_validos() throws ElementFindException, InterruptedException {
		
		logger.info("Ínicio do preenchimento das informações de login.");
		
		//Email e Senha
		loginPage.preencherDados("testedesistema2018@hotmail.com", "estoutestando");
		
		
	
		logger.info("Preenchimento de Informações de Login Concluido.");
		
	}
	
	@Step("Então deverá ir para a home page")
	public void entao_devera_ir_para_a_home_page() {
		
		logger.info("Verificar se estou na Página Home.");
		
		Assert.assertTrue(homePage.verificarPaginaHome());
		
	}
}
