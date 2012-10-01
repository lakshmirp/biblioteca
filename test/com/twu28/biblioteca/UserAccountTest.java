package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class UserAccountTest {
    @Test
    public void testReturnOfUserDetails(){
        UserAccount userAccount = new UserAccount("111-1111","pass1");
        Assert.assertEquals("Your Library Number:111-1111\nYour Password:pass1\nYour Name:null\nYour EmailId:null\nYour Phone Number:null\n",userAccount.toString());
    }
    static class User {
        static UserAccount userAccount1 = new UserAccount("111-1111","password1");
        static UserAccount userAccount2 = new UserAccount("111-1111","password1");
        static UserAccount userAccount3 = new UserAccount("111-1111","password1");
        static UserAccount userAccount4 = new UserAccount("111-1234","password10");
    }
    @Test

    public void testEqualToSelf() {

        assertTrue("Class equal to itself.", User.userAccount1.equals(User.userAccount1));
    }


    @Test
    public void testIncompatibleTypeIsFalse() {
        assertFalse("Passing incompatible object to equals should return false", User.userAccount1.equals("string"));
    }


    @Test
    public void testNullReferenceIsFalse() {
        assertFalse("Passing null to equals should return false", User.userAccount1.equals(null));
    }


    @Test
    public void testEqualsForSymmetric() {

        assertTrue("Symmetric test", User.userAccount1.equals(User.userAccount2));
        assertTrue("Symmetric test ", User.userAccount2.equals(User.userAccount1));

    }

   
    @Test
    public void testEqualsForTransitive() {

        assertTrue("Transitive test ", User.userAccount1.equals(User.userAccount2));
        assertTrue("Transitive test ", User.userAccount2.equals(User.userAccount3));
        assertTrue("Transitive test ", User.userAccount1.equals(User.userAccount3));
    }

    
    @Test
    public void testEqualsForConsistency() {

        assertTrue("Consistent test ", User.userAccount1.equals(User.userAccount2));
        assertTrue("Consistent test ", User.userAccount1.equals(User.userAccount2));
        assertTrue("Consistent test ", User.userAccount1.equals(User.userAccount2));
        assertFalse(User.userAccount4.equals(User.userAccount1));
        assertFalse(User.userAccount4.equals(User.userAccount1));
        assertFalse(User.userAccount4.equals(User.userAccount1));
        
    }


}


