package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class UserAccountTest {

    @Test
    public void test_user_display(){
        UserAccount userAccount = new UserAccount("111-1111","pass1");
        Assert.assertEquals("111-1111\tpass1\t\t\t\n",userAccount.display_user_details());
    }
}