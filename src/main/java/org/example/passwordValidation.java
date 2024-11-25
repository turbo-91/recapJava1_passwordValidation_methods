package org.example;

import java.lang.reflect.Array;

public class passwordValidation {

    // method to check the length of the password is at least 8 characters: pwLength_min8

    public static Boolean pwLength_min8(String password) {
        if (password.length() >= 8)
        return true;
        else return false;
    };



    // method to check if the password contains digits: pwContains_digits
    public static Boolean pwContains_digits(String password) {
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (String digit : digits) {
            if (password.contains(digit)) {
                return true;
            }
        }
        return false;}
    };


    // method to check if the password contains lowerCase AND upperCase letters: pwContains_lowerCaseUpperCase



    // method to check if the password is commonly used: pwIs_commonlyUsed




