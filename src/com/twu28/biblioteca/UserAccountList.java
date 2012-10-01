package com.twu28.biblioteca;


import java.util.ArrayList;

public class UserAccountList {

    public static ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();

    UserAccountList(){
        addUsers();
    }
    private static void addUsers(){

            userAccounts.add(new UserAccount("111-1111","pass1"));
            userAccounts.add(new UserAccount("111-1112","pass2"));
            userAccounts.add(new UserAccount("111-1113","pass3"));
            userAccounts.add(new UserAccount("111-1114","pass4"));
            userAccounts.add(new UserAccount("111-1115","pass5"));

    }


    public Boolean authenticate(String userName,String password){
        UserAccount userAccount = new UserAccount(userName,password);

            return this.userAccounts.contains(userAccount);

    }


}
