package com.twu28.biblioteca;

import java.util.Scanner;

public class userinput implements inputoutputinterface{

    Scanner scan = new Scanner(System.in);

    @Override
    public void println(String string) {
         System.out.println(string);
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

    @Override
    public String getusername() {
        return scan.next();
    }

    @Override
    public String getpassword() {
        return scan.next();
    }

}
