package com.twu28.biblioteca;


import java.util.ArrayList;

public class UserAccountList {

    private ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();

    UserAccountList(){
        add_users();
    }

    private void add_users(){
            userAccounts.add(new UserAccount("111-1111","pass1"));
            userAccounts.add(new UserAccount("111-1112","pass2"));
            userAccounts.add(new UserAccount("111-1113","pass3"));
            userAccounts.add(new UserAccount("111-1114","pass4"));
            userAccounts.add(new UserAccount("111-1115","pass5"));

    }

    public Boolean authenticateUser(String userName,String password){
        UserAccount userAccount = new UserAccount(userName,password);

        for( int i=0;i<userAccounts.size();i++){
            if(this.userAccounts.contains(userAccount))
                return true;
        }
        return false;
    }
}
