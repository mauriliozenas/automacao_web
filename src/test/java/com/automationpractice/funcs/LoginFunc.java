package com.automationpractice.funcs;

import com.automationpractice.common.BaseTest;
import com.automationpractice.pages.LoginPage;
import org.openqa.selenium.By;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();
    public void acessarTelaLogin(){
        driver.get("https://automationtest.shop/index.php?controller=authentication&back=my-account");
    }

    public void realizarLogin(String usuario, String senha){
        driver.findElement(loginPage.getCampoEmailRegistrado()).sendKeys(usuario);
        driver.findElement(loginPage.getCampoSenhaRegistrada()).sendKeys(senha);
        driver.findElement(loginPage.getBotaoSignIn()).click();

    }
}
