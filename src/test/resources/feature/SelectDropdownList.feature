#language: pt

@4
Funcionalidade: SelectDropdownList

Cenario: Select List Demo
         Dado que estou na pagina Select Dropdown List
         Quando selecionar Friday
         Entao devera ser apresentada a mensagem Day selected :- Friday


Cenario: Multi Select List Demo 1
         Dado que estou na pagina Select Dropdown List
         Quando selecionar New York
         E clicar em First Selected
         Entao devera ser apresentada a mensagem First selected option is : New York


Cenario: Multi Select List Demo 1
        Dado que estou na pagina Select Dropdown List
        Quando selecionar California, Ohio e Texas
        E clicar em Get All Selected
        Entao devera ser apresentada a mensagem Options selected are : California,Ohio,Texas
