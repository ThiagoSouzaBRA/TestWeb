#language: pt

@3
Funcionalidade: RadioButtonsDemo

Cenario: Radio Button Demo
         Dado que estou na pagina Radio Buttons Demo
         Quando selecionar Male
         E clicar em Get Checked value
         Entao devera ser apresentada a mensagem “Radio button 'Male' is checked”


Cenario: Group Radio Buttons Demo
         Dado que estou na pagina Radio Buttons Demo
         Quando selecionar Female e 5 to 15
         E CLICAR em Get values
         Entao devera ser apresentada a mensagem Sex : Female Age group: 15 – 50
