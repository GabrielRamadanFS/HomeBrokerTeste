#language:pt


@positivos
Funcionalidade: Realizar Compra de Ativo
Como usuario 
Quero realizar comprar o ativo
Para adquirir a minha carteira

Contexto: Acessar o site
Dado que eu esteja na pagina logado "https://desafio.ui.e2etreinamentos.com.br/home.html"

Cenario: Comprar Ativo
Quando eu preencho os dados do ativo e clico comprar
E eu confirmo o Modal de Confirmacao de Compra
Entao o ativo aparece na minha carteira. 