package com.example.junittestacara17;

//importing assertTrue method from JUnit Assert Class
import static org.junit.Assert.assertTrue;

//importing the Test from JUnit framework
import org.junit.Test;


public class EmailValidatorTest {
    @Test
    public  void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        //setting a validEmail address for a test case
        String validEmail = "arya@gmail.com";
        //assert that the email is considered Valid
        assertTrue(EmailValidator.isValidEmail(validEmail));
    }
}
