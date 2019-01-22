#language: pt
@1
Funcionalidade: CheckboxDemo

Cenario: Single Checkbox Demo
         Dado que estou na pagina Checkbox Demo
         Quando clicar em Click on this check box
         Entao devera ser apresentada a mensagem Success - Check box is checked

Cenario: Multiple Checkbox Demo
        Dado que estou na pagina Checkbox Demo
        Quando clicar no botao Check All
        Entao verificar se todos os checkboxs foram marcados
        Quando clicar no botao Uncheck All
        Entao verificar se todos os checkboxs foram desmarcados