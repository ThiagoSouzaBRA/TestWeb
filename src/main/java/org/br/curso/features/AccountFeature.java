package org.br.curso.features;

import com.br.inmetrics.frm.bdd.Feature;
import com.br.inmetrics.frm.bdd.Scenario;
import com.br.inmetrics.frm.bdd.Tags;
import com.br.inmetrics.frm.exceptions.GherkinFeatureNotFoundException;
import com.br.inmetrics.frm.exceptions.GherkinScenarioNotFoundException;
import com.br.inmetrics.frm.testng.DataTableConfig;

import static com.br.inmetrics.frm.bdd.Gherkin.executeScenario_;
import static com.br.inmetrics.frm.bdd.Gherkin.given_;

import java.util.concurrent.ExecutionException;

@Feature("AccountManager")
public class AccountFeature {
	
	@Scenario("Mudar o nome de usuario")
	@Tags("Edit")
	public void editar_conta() throws ExecutionException, GherkinFeatureNotFoundException, GherkinScenarioNotFoundException {
		
		executeScenario_("Login", "Efetuar Login com usuario válido");
		
		given_("Dado que esteja na Home Page").
		when_("Quando estiver na sessão de edição").
		and_("Quando preencher os dados validos").
		then_("Então deverá ser salvo").
		execute_();
	}
	
	@Scenario("Deixar Recado")
	@Tags("Recado")
	public void adicionar_recado() throws ExecutionException, GherkinFeatureNotFoundException, GherkinScenarioNotFoundException {
		
		executeScenario_("Login", "Efetuar Login com usuario válido");
		
		given_("Dado que esteja na Página de Usuario").
		when_("Quando estiver na sessão meu perfil").
		and_("Quando preencher os campos validos").
		then_("Então deverá ser enviado").
		execute_();
	}
	
	@Scenario("Deixar Visto em Filme")
	@Tags("Visto")
	public void deixar_visto() throws ExecutionException, GherkinFeatureNotFoundException, GherkinScenarioNotFoundException {
		
		executeScenario_("Login", "Efetuar Login com usuario válido");
		
		given_("Dado que esteja na Página de Usuario1").
		when_("Quando estiver no filme selecionado").
		and_("Quando marcar filme já visto").
		then_("Então deverá ser salvo1").
		execute_();
	}
	
	@Scenario("Deixar Comentario em Filme")
	@Tags("Comentario")
	public void deixar_comentario() throws ExecutionException, GherkinFeatureNotFoundException, GherkinScenarioNotFoundException {
		
		executeScenario_("Login", "Efetuar Login com usuario válido");
		
		given_("Dado que esteja na Página de Usuario2").
		when_("Quando estiver no filme selecionado1").
		and_("Quando comentar filme").
		then_("Então deverá ser salvo2").
		execute_();
	}
	
}
