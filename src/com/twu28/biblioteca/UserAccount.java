package com.twu28.biblioteca;

public class UserAccount {

    private String libraryNumber;
    private String password;
    private String name;
    private String emailId;
    private String phoneNumber;

    UserAccount(String librarynum,String passwd){
        this.libraryNumber = librarynum;
        this.password = passwd;
    }

    public String getName(){
        return name;
    }

    public String getEmailId(){
        return emailId;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String returnUserDetails(){
        return this.libraryNumber+"\t"+this.password+"\t"+this.name+"\t"+this.emailId+"\t"+this.phoneNumber+"\n";
    }


}
