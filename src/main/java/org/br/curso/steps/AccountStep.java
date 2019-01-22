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
public class AccountStep {

	HomePage  homePage = getPage_(HomePage.class);
	EditPage  editPage = getPage_(EditPage.class);
	PerfilPage perfilPage = getPage_(PerfilPage.class);
	
	LoggerHelper logger = new LoggerHelper(AccountStep.class);
	
	@Step("Dado que esteja na Home Page")
	public void dado_que_esteja_na_home_page() throws ElementFindException {
		
		logger.info("Verificar se estou na página Home.");
		homePage.clicarBotao__Editar_Perfil();
	}
	
	@Step("Quando estiver na sessão de edição")
	public void quando_estiver_na_sessao_de_edicao() throws ElementFindException, InterruptedException {
		
		logger.info("Verificando se está na sessão de edição.");
		
		Assert.assertTrue(editPage.verificarPaginaEdit());
		
		
	}
	
	@Step("Quando preencher os dados validos")
	public void quando_preencher_os_dados_validos() throws ElementFindException {
		
		logger.info("Preenchendo Campos.");
		
		editPage.preencherDados("Thiago", "Masculino", "17/06/1994", "Brasil", "Um simples Teste");
		
	}
	
	@Step("Então deverá ser salvo")
	public void entao_devera_ser_salvo() {
		
		logger.info("Verificar se estou na Página Home.");
		
		Assert.assertTrue(editPage.verificarSalvamento());
		
	}	
	

	
	
	
}
