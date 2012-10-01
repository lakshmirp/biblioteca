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


    public String toString(){
        return "Your Library Number:"+this.libraryNumber+"\nYour Password:"+this.password+"\nYour Name:"+this.name+"\nYour EmailId:"+this.emailId+"\nYour Phone Number:"+this.phoneNumber+"\n";
    }

    @Override
    public boolean equals(Object object){

       if(this == object)
           return true;
       if(object == null || object.getClass() != this.getClass())
           return false;
       UserAccount userAccount = (UserAccount)object;
        return userAccount.libraryNumber.equals(this.libraryNumber) && userAccount.password.equals(this.password) ;
    }

}
