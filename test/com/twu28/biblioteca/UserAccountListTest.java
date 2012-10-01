package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserAccountListTest {

    @Test
    public void testAddUserAccounts(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) true,userAccountList.authenticate("111-1111","pass1"));
    }

    @Test
    public void testLegitimateUser(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) true,userAccountList.authenticate("111-1111","pass1"));
    }

    @Test
    public void testUnsuccessfulAuthenticationInvalidPassword(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) false,userAccountList.authenticate("111-1111","pass5"));
    }

    @Test
    public void testUnsuccessfulAuthenticationInvalidUsername(){
        UserAccountList userAccountList = new UserAccountList();
        Assert.assertEquals((Object) false,userAccountList.authenticate("555-1111","pass1"));
    }


}
