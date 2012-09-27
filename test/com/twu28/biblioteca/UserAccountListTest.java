package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserAccountListTest {

    @Test
    public void testAddUserAccounts(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) true,userAccountList.authenticateUser("111-1111","pass1"));
    }

    @Test
    public void testLegitimateUser(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) true,userAccountList.authenticateUser("111-1111","pass1"));
    }

    @Test
    public void testInvalidPassword(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) false,userAccountList.authenticateUser("111-1111","pass1"));
    }

    @Test
    public void testInvalidUsername(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) false,userAccountList.authenticateUser("111-1111","pass1"));
    }


}
