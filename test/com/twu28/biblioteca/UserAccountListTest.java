package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserAccountListTest {

    @Test
    public void testAddUserAccounts(){
        UserAccountList userAccountList = new UserAccountList();
        UserAccount userAccount = new UserAccount("111-1111","pass1");
        Assert.assertEquals((Object) true,userAccountList.authenticateUser(userAccount));
    }

    @Test
    public void testLegitimateUser(){
        UserAccountList userAccountList = new UserAccountList();
        UserAccount userAccount = new UserAccount("111-1111","pass1");
        Assert.assertEquals((Object) true,userAccountList.authenticateUser(userAccount));
    }

    @Test
    public void testInvalidPassword(){
        UserAccountList userAccountList = new UserAccountList();
        UserAccount userAccount = new UserAccount("111-1111","pass5");
        Assert.assertEquals((Object) false,userAccountList.authenticateUser(userAccount));
    }

    @Test
    public void testInvalidUsername(){
        UserAccountList userAccountList = new UserAccountList();
        UserAccount userAccount = new UserAccount("511-1111","pass1");
        Assert.assertEquals((Object) false,userAccountList.authenticateUser(userAccount));
    }


}
