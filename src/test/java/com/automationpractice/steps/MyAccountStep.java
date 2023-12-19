package com.automationpractice.steps;

import com.automationpractice.funcs.MyAccountFunc;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class MyAccountStep {

    MyAccountFunc myAccountFunc = new MyAccountFunc();
    @Entao("devo visualizar o nome {string}")
        public void devoVisualizarNome(String nome){
            Assert.assertEquals(nome, myAccountFunc.getNomeUsuarioLogado());


        }



}
