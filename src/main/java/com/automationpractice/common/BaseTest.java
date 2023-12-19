package com.automationpractice.common;

import com.automationpractice.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public static WebDriver driver;


    protected void inicializarDriver(AplicacaoWeb aplicacaoWeb){
        driver = aplicacaoWeb.getDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
