package core;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
             features = "src/test/resources/feature/",
             glue = "org.br.inmetrics.steps",
             tags = {"@teste"}, // para ignorar basta colocar o ~@cenario, multi tag "@conta, @aprender"
             //plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, // exibir as features no console
             monochrome = true,
             snippets = SnippetType.CAMELCASE, // coloca os metodos concatenados 
             dryRun = false,  // valida a estrutura dos testes
             strict = false // caso nao encontre um teste, da erro no teste
             )


public class Aplic {
	

}
