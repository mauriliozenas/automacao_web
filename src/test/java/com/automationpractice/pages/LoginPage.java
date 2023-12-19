package com.automationpractice.pages;

import org.openqa.selenium.By;

public class LoginPage {
    By campoEmailRegistrado = By.id("email");
    By campoSenhaRegistrada = By.id("passwd");
    By botaoSignIn = By.id("SubmitLogin");

    public By getCampoEmailRegistrado() {
        return this.campoEmailRegistrado;
    }

    public By getCampoSenhaRegistrada(){
        return this.campoSenhaRegistrada;
    }

    public By getBotaoSignIn(){
        return this.botaoSignIn;
    }
}
