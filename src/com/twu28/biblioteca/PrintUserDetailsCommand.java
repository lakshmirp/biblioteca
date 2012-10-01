package com.twu28.biblioteca;

public class PrintUserDetailsCommand implements Command {
    UserAccountList userAccountList = new UserAccountList();
    Console console = new UserConsole();
    UserAccount userAccount;
    String username = null;
    String password = null;
    @Override
    public void execute() {
        console.println("Enter Your UserName");
        if(username == null)
            username = console.readLine();
        console.println("Enter Your Password");
        if(password == null)
            password = console.readLine();
        userAccount = new UserAccount(username,password);
        if(userAccountList.authenticate(username,password))
            console.println(userAccount.toString());
        else
            console.println("Please Talk To Your Librarian");

    }
}
