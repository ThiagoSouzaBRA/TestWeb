package org.br.curso.features;

import com.br.inmetrics.frm.bdd.Feature;
import com.br.inmetrics.frm.bdd.Scenario;
import com.br.inmetrics.frm.bdd.Tags;
import com.br.inmetrics.frm.testng.DataTableConfig;

import static com.br.inmetrics.frm.bdd.Gherkin.given_;

import java.util.concurrent.ExecutionException;

@Feature("Login")
public class LoginFeature {
	
	@Scenario("Efetuar Login com usuario válido")
	@Tags("Login")
	public void login_valido() throws ExecutionException {
		
		given_("Dado que estou na pagina de login").
		when_("Quando preencher o login com dados válidos").
		then_("Então deverá ir para a home page").
		execute_();
		
	}

}
