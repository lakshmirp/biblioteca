package com.twu28.biblioteca;


import java.util.ArrayList;

public class AccountManager {

    ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();

    public Boolean add_users(){
        try{
            userAccounts.add(new UserAccount("111-1111","pass1","First User","user1@gmail.com","9999900000"));
            userAccounts.add(new UserAccount("111-1112","pass2","Second User","user2@gmail.com","9999910000"));
            userAccounts.add(new UserAccount("111-1113","pass3","Third User","user3@gmail.com","9999920000"));
            userAccounts.add(new UserAccount("111-1114","pass4","Fourth User","use41@gmail.com","9999930000"));
            userAccounts.add(new UserAccount("111-1115","pass5","Fifth User","user5@gmail.com","9999940000"));
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public ArrayList<UserAccount> display_user_details(){
        return userAccounts;
    }

    public Boolean check_valid_user(UserAccount userAccount){

        for( int i=0;i<userAccounts.size();i++){
            if(this.userAccounts.get(i).LibraryNumber == userAccount.LibraryNumber && this.userAccounts.get(i).Password == userAccount.Password)
                return true;

        }
        return false;
    }
}
