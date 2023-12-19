package com.automationpractice.configuration;

import com.automationpractice.common.BaseTest;
import com.automationpractice.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseTest {

    @Before
    public void beforeTest(){
        super.inicializarDriver(Web.CHROME);

    }


//    @After
//  //  public void afterTest(){
//        driver.quit();
    }

