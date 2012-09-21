package com.twu28.biblioteca;

import org.junit.Test;

public class MainprogramTest {

    inputoutputinterface inputoutputinterface = new userinputstub();
    Mainprogram mainprogram = new Mainprogram();

    @Test
    public void test_for_option1(){
        mainprogram.setInputoutputinterface(inputoutputinterface);
        inputoutputinterface.setoption("1");
        mainprogram.executelogic();
    }

    @Test
    public void test_for_option2(){
        mainprogram.setInputoutputinterface(inputoutputinterface);
        inputoutputinterface.setoption("2");
        mainprogram.executelogic();
    }

    @Test
     public void test_for_option3(){
        mainprogram.setInputoutputinterface(inputoutputinterface);
        inputoutputinterface.setoption("3");
        mainprogram.executelogic();
    }

    @Test
     public void test_for_option4(){
        mainprogram.setInputoutputinterface(inputoutputinterface);
        inputoutputinterface.setoption("4");
        mainprogram.executelogic();
    }
}
