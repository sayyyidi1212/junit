package com.example.junittestacara17;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        //defining the format for valid email address
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        /*checks if the given email address is valid or not
          & returns true if valid or false if not valid*/
        return email.matches(emailRegex);
    }

}
