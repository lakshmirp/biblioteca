package com.twu28.biblioteca;

public class userinputstub implements inputoutputinterface{

    String choice;

    @Override
    public void println(String string) {

    }

    @Override
    public String readLine() {
        return null;
    }

    @Override
    public String getoption() {
        return choice;
    }

    @Override
    public void setoption(String option) {
        choice=option;
    }
}
