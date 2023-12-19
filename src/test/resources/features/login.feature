#language: pt
#enconding: UTF-8
#autor: Maurilio
#date: 18/12/2023
#version: 1.0


Funcionalidade: Login
  Com essa Funcionalidade iremos conseguir realizar
  o login na aplicação com usuário já cadastrado.

  Como um usuário já cadastrado na aplicação
  Eu quero inserir os meus dados cadastrais
  Para conseguir realizar o login na aplicação

  Contexto: Entrar na tela de login
    Dado estiver na tela de login

  @loginAplicacao
  Cenario: Validar o login na aplicação
    Quando inserir os dados do usuário "juscianobatista@gmail.com"
    Então devo visualizar o nome "jusciano batista"

  Esquema do Cenario: Validar a mensagem de erro ao inserir dados incorretos
    Quando inserir os dados do usuario <dados_usuarios>
    Então devo visualizar a mensagem de erro "Authenticaton failed."

    Exemplos:

    | dados_usuarios  |
    | "email_incorreto" |
    | "senha_incorreta" |