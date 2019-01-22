#language: pt


Funcionalidade: SimpleFormDemo
@teste
Cenario: Single Input Field
		        Dado que estou na pagina Simple Form Demo
		        Quando preencher o campo Enter Message com a mensagem Treinamento Inmetrics
		        E clicar em Show Message
		        Entao devera ser apresentada a mensagem Your Message: Treinamento Inmetrics
			
Cenario: Two Input Fields
		         Dado que estou na pagina Simple Form Demo
		         Quando preencher o campo A com 5 e o campo B com 6
		         E clicar em Get Total
		         Entao devera ser apresentada a mensagem Total a + b = 11

		         