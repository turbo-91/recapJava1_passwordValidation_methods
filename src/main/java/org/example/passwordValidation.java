package org.example;

import java.lang.reflect.Array;

public class passwordValidation {

    // method to check the length of the password is at least 8 characters: pwLength_min8

    public static Boolean pwLength_min8(String password) {
        if (password == null) return false;
        if (password.length() >= 8)
            return true;
        else return false;
    };


    // method to check if the password contains digits: pwContains_digits
    public static Boolean pwContains_digits(String password) {
        if (password == null) return false;
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (String digit : digits) {
            if (password.contains(digit)) {
                return true;
            }
        }
        return false;}

    // method to check if the password contains digits: pwContains_lowerCaseUpperCase
    public static Boolean pwContains_LowerCaseUpperCase(String password) {
        if (password == null) return false;
        String[] uppercaseLetters = new String[26];
        for (int i = 0; i < 26; i++) {
            uppercaseLetters[i] = String.valueOf((char) ('A' + i));
        }

        String[] lowercaseLetters = new String[26];
        for (int i = 0; i < 26; i++) {
            lowercaseLetters[i] = String.valueOf((char) ('a' + i));
        }

        Boolean upperBoolean = false;
        Boolean lowerBoolean = false;

        for (String character : uppercaseLetters) {
            if (password.contains(character)) {
                upperBoolean = true;
            }
        }
        for (String character : lowercaseLetters) {
            if (password.contains(character)) {
                lowerBoolean = true;
            }
        }

        if (upperBoolean && lowerBoolean) {
            return true;
        }
        else return false;

    };

    // method to check if the password is commonly used: pwIs_commonlyUsed

    public static Boolean pwIs_commonlyUsed(String password) {
        if (password == null) return false;
        String[] weakPasswords = {
                // General Weak Passwords
                "123456", "password", "123456789", "12345678", "12345",
                "1234567", "1234567890", "qwerty", "abc123", "password1",

                // Variations of "Password" with numbers and symbols
                "Password", "Password1", "Passw0rd", "P@ssword", "P@ssw0rd",
                "password123", "Password123", "Pass1234", "Passw0rd123",

                // Simple Numeric Patterns
                "111111", "222222", "333333", "444444", "555555", "666666",
                "777777", "888888", "999999", "000000",
                "121212", "123123", "654321", "987654",

                // Keyboard Patterns
                "qwerty123", "asdfgh", "zxcvbn", "qwertyuiop", "asdfghjkl",
                "1q2w3e4r", "1qaz2wsx", "qwe123", "qweasd", "zxc123", "zxcvbnm",

                // Popular Words and Phrases
                "welcome", "admin", "letmein", "iloveyou", "sunshine", "princess",
                "football", "baseball", "dragon", "monkey", "trustno1",

                // Variations with Year Suffix
                "password2023", "password2024", "welcome2023", "qwerty2023",
                "admin2023", "1234562023", "iloveyou2024",

                // Personal and Contextual Passwords
                "yourname", "firstname", "lastname", "birthday", "username",
                "default", "changeme", "temp123", "test123", "guest",

                // Obvious Short Words
                "love", "god", "job", "boss", "hero", "baby",

                // Common Weak Phrases
                "123qwe", "123abc", "abc1234", "qwe1234", "ilove123",

                // Common Numeric Date Patterns
                "2000", "2023", "2024", "1980", "1990", "1999",
                "01011990", "12345678", "01012000"
        };
        for (String weakPW : weakPasswords) {
            if (password == weakPW) {
                return true;
            }
        }
        return false;
    };

}














