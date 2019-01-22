package org.br.curso.tests;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.br.inmetrics.frm.base.TestBase;
import com.br.inmetrics.frm.controllers.WebController;
import com.br.inmetrics.frm.testng.DataTableConfig;
import com.br.inmetrics.frm.testng.TestConfig;

import static com.br.inmetrics.frm.bdd.Gherkin.executeScenario_;

import java.lang.reflect.Method;

@TestConfig(controllerType=WebController.class)
public class TestApp extends TestBase{
	
	@Test
	public void testLogin() {
		
		try {
		executeScenario_("login", "Efetuar Login com usuario válido");
		} catch(Exception e){
			Assert.fail("Erro ao Executar a aplicação",e);
		}
	}
	
	//Abre Navegador
	@BeforeMethod
	public void setup(final Method method, final ITestContext context) {
		super.setup(method, context);
	}
	//Fecha Navegador
	@AfterMethod 
	public void teardown(final Method method, final ITestContext context){
		super.teardown(method, context);
	}


}
