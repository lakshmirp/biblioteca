package com.twu28.biblioteca;

import org.junit.Before;
import org.junit.Test;

public class MainprogramTest {

    inputoutputinterface inputoutputinterface = new userinputstub();

    @Before {
    Mainprogram mainprogram = new Mainprogram();
    mainprogram.setInputoutputinterface(inputoutputinterface);
    }

    @Test
    public void test_for_option1(){
        inputoutputinterface.setoption("1");
    }
}
