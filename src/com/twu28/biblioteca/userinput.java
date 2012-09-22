package com.twu28.biblioteca;

import java.util.Scanner;

public class userinput implements inputoutputinterface{

    Scanner scan = new Scanner(System.in);

    @Override
    public void println(String string) {

    }

    @Override
    public String readLine() {
        return scan.next();
    }

    @Override
    public String getoption() {
        System.out.println("Choose Your Option");
        return scan.next();
    }

    @Override
    public void setoption(String option) {

    }
}
