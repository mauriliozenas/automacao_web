package com.automationpractice.steps;

import com.automationpractice.funcs.LoginFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();

    @Dado("estiver na tela de login")
    public void estiverNaTelaLogin(){
        loginFunc.acessarTelaLogin();


    }
    @Quando("inserir os dados do usuário {string}")
    public void inserirDadosUsuario(String usuario) {
        loginFunc.realizarLogin(usuario,"teste@teste123");


    }
    @Entao("devo visualizar a mensagem de erro {string}")
    public void deveVisualizaMensagem(String mensagem){

    }


}
