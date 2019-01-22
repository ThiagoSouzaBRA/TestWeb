package org.br.curso.pages;

import com.br.inmetrics.frm.base.PageBase;
import com.br.inmetrics.frm.base.VirtualElement;
import com.br.inmetrics.frm.exceptions.ElementFindException;
import com.br.inmetrics.frm.helpers.LoggerHelper;

import static com.br.inmetrics.frm.helpers.QueryHelper.get;

import org.openqa.selenium.By;


public class EditPage extends PageBase {
	

	VirtualElement checkPage = get(By.xpath("//h1[text()='Editar perfil']")),
				   txtNome = get(By.xpath("//*[@id=\"id_name\"]")),
				   txtSexo = get(By.xpath("//*[@id=\"id_gender\"]")),
				   txtDtNascimento = get(By.xpath("//*[@id=\"id_birthday\"]")),
				   txtPais = get(By.xpath("//*[@id=\"id_country\"]")),
				   txtSobre = get(By.xpath("//*[@id='id_about']")),
				   btnSalvar = get(By.xpath("//button[text()='Salvar']")),
				   checkSalvamentoConcluido = get(By.xpath("//div[@class='alert alert-block alert-success']"));
	
	LoggerHelper logger = new LoggerHelper(EditPage.class);
	
	public boolean verificarPaginaEdit() {
		
		logger.info("Verificar se está na página de Edição.");
		
		return elementExists(checkPage);
	}

	public void preencherDados(String Nome, String Sexo, String DtNascimento, String Pais, String Sobre) throws ElementFindException{
		
		logger.info("Preenchendo Campos de Edição Perfil.");
		
		txtNome.clear();
		txtNome.setValue(Nome);
		txtSexo.setValue(Sexo);
		txtDtNascimento.clear();
		txtDtNascimento.setValue(DtNascimento);
		txtPais.setValue(Pais);
		txtSobre.clear();
		txtSobre.setValue(Sobre);
		
		logger.info("Preenchimento concluido.");
		
		btnSalvar.click();
		
		logger.info("Salvando Alterações.");
		
	}
	
	public boolean verificarSalvamento() {
	
		logger.info("Verificando Salvamento de Alterações.");
		
		return elementExists(checkSalvamentoConcluido);
		
		}
	}


