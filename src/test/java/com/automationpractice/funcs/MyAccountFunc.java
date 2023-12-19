package com.automationpractice.funcs;

import com.automationpractice.common.BaseTest;
import com.automationpractice.pages.MyAccountPage;
import org.openqa.selenium.By;

public class MyAccountFunc extends BaseTest {
    MyAccountPage myAccountPage = new MyAccountPage();

    public String getNomeUsuarioLogado(){
        return driver.findElement(myAccountPage.getTitleUsuarioLogado()).getText();

    }
}
