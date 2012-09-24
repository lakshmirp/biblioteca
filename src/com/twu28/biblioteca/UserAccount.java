package com.twu28.biblioteca;

public class UserAccount {

    String LibraryNumber;
    String Password;
    String Name;
    String EmailId;
    String PhoneNumber;

    UserAccount(String librarynumber,String password){
        this.LibraryNumber = librarynumber;
        this.Password = password;
        this.Name = "";
        this.EmailId = "";
        this.PhoneNumber = "";
    }

    UserAccount(String librarynumber,String password,String name,String emailId,String phoneNumber){
        this.LibraryNumber = librarynumber;
        this.Password = password;
        this.Name = name;
        this.EmailId = emailId;
        this.PhoneNumber = phoneNumber;
    }

    public String display_user_details(){
        return this.LibraryNumber+"\t"+this.Password+"\t"+this.Name+"\t"+this.EmailId+"\t"+this.PhoneNumber+"\n";
    }
}
