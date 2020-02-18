package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = UserRegistration.validInputName("Sameer");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean firstName =UserRegistration.validInputName("ameer13");
        Assert.assertFalse(firstName);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = UserRegistration.validInputName("Patil");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean lastName =UserRegistration.validInputName("PAtil7");
        Assert.assertFalse(lastName);
    }
    @Test
    public void givenEmailId_WhenProper_ShouldReturnFalse() {
        boolean emailId = UserRegistration.validateEmailId("abc@gail.com");
        Assert.assertTrue(emailId);
    }
    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean emailId = UserRegistration.validateEmailId("abcgail.com");
        Assert.assertFalse(emailId);
    }
}
