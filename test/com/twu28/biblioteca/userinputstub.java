package com.twu28.biblioteca;

public class userinputstub implements inputoutputinterface{

    String choice;
    String username;
    String password;

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
    @Override
    public String getusername() {
        return username;
    }

    @Override
    public String getpassword() {
        return password;
    }
}
