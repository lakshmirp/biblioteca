package com.twu28.biblioteca;


import java.util.Scanner;

public class SystemConsole implements Console{
    Scanner scanner = new Scanner(System.in);


    @Override
    public void println(String string) {
        System.out.println(string);
    }

    @Override
    public String readLine() {
        return scanner.next();
    }



}
