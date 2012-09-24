package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

public class AccountManagerTest {

    @Test
    public void test_add_users(){
        AccountManager accountManager = new AccountManager();
        Assert.assertEquals((Object) true, accountManager.add_users());
    }

    @Test
    public void test_display_user_details(){
        AccountManager accountManager = new AccountManager();
        accountManager.add_users();
        Assert.assertEquals("111-1111\tpass1\tFirst User\tuser1@gmail.com\t9999900000\n",accountManager.display_user_details().get(0).display_user_details());
    }

    @Test
    public void test_successful_login(){
        AccountManager accountManager = new AccountManager();
        accountManager.add_users();
        UserAccount userAccount = new UserAccount("111-1111","pass1");
        Assert.assertEquals((Object) true,accountManager.check_valid_user(userAccount));
    }

    @Test
    public void test_unsuccessful_login_for_wrong_username(){
        AccountManager accountManager = new AccountManager();
        accountManager.add_users();
        UserAccount userAccount = new UserAccount("555-1111","pass1");
        Assert.assertEquals((Object) false,accountManager.check_valid_user(userAccount));
    }

    @Test
    public void test_successful_login_for_wrong_password(){
        AccountManager accountManager = new AccountManager();
        accountManager.add_users();
        UserAccount userAccount = new UserAccount("111-1111","pass6");
        Assert.assertEquals((Object) false,accountManager.check_valid_user(userAccount));
    }

    @Test
    public void test_successful_login_for_wrong_login_details(){
        AccountManager accountManager = new AccountManager();
        accountManager.add_users();
        UserAccount userAccount = new UserAccount("111-5555","pass10");
        Assert.assertEquals((Object) false,accountManager.check_valid_user(userAccount));
    }
}
