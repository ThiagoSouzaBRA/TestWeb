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
import org.br.curso.pages.FilmePage;
import org.br.curso.pages.HomePage;
import org.testng.Assert;

@DesignSteps
public class VistoStep{
	
	HomePage  homePage = getPage_(HomePage.class);
	FilmePage filmePage = getPage_(FilmePage.class);
	
	LoggerHelper logger = new LoggerHelper(VistoStep.class);
	
	@Step("Dado que esteja na Página de Usuario1")
	public void dado_que_esteja_na_pagina_de_usuario1() throws ElementFindException {
	
	logger.info("Verificar se estou na página Home.");
	
	Assert.assertTrue(homePage.verificarPaginaHome());
	
	homePage.clicarSelecionar_Filme_Aleatorio();
	}
	
	@Step("Quando estiver no filme selecionado")
	public void quando_estiver_no_filme_selecionado() throws ElementFindException, InterruptedException {
	
	
	Assert.assertTrue(filmePage.verificarPaginaFilme());
	
	logger.info("Está na página do filme");
	
	
	}
	
	@Step("Quando marcar filme já visto")
	public void quando_marcar_filme_ja_visto() throws ElementFindException, InterruptedException {
	
	filmePage.MarcarComoVisto();
	
	}
	
	@Step("Então deverá ser salvo1")
	public void entao_devera_ser_salvo() {
	
		Assert.assertTrue(filmePage.verificarSalvamento());
	
	
	}

}
