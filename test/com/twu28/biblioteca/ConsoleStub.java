package com.twu28.biblioteca;

public class ConsoleStub implements Console{

    @Override
    public void println(String string) {

    }

    @Override
    public String readLine() {
        return null;
    }
}