package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecurePasswordGeneratorTest {

    // Test 1: Password length should be at least 12 characters
    @Test
    void generatedPassword_ShouldBeAtLeast12Characters() {
        // GIVEN
        // No input required as it's a generator function

        // WHEN
        String password = SecurePasswordGenerator.generateSecurePassword();

        // THEN
        Assertions.assertTrue(password.length() >= 12, "Password should be at least 12 characters long");
    }

    // Test 2: Password should contain at least one uppercase letter
    @Test
    void generatedPassword_ShouldContainUppercaseLetter() {
        // GIVEN
        // No input required as it's a generator function

        // WHEN
        String password = SecurePasswordGenerator.generateSecurePassword();

        // THEN
        Assertions.assertTrue(password.chars().anyMatch(Character::isUpperCase), "Password should contain at least one uppercase letter");
    }

    // Test 3: Password should contain at least one lowercase letter
    @Test
    void generatedPassword_ShouldContainLowercaseLetter() {
        // GIVEN
        // No input required as it's a generator function

        // WHEN
        String password = SecurePasswordGenerator.generateSecurePassword();

        // THEN
        Assertions.assertTrue(password.chars().anyMatch(Character::isLowerCase), "Password should contain at least one lowercase letter");
    }

    // Test 4: Password should contain at least one digit
    @Test
    void generatedPassword_ShouldContainDigit() {
        // GIVEN
        // No input required as it's a generator function

        // WHEN
        String password = SecurePasswordGenerator.generateSecurePassword();

        // THEN
        Assertions.assertTrue(password.chars().anyMatch(Character::isDigit), "Password should contain at least one digit");
    }

    // Test 5: Password should contain at least one special character
    @Test
    void generatedPassword_ShouldContainSpecialCharacter() {
        // GIVEN
        String specialCharacters = "!@#$%^&*()-_=+[]{};:'\",.<>?/|\\~`";

        // WHEN
        String password = SecurePasswordGenerator.generateSecurePassword();

        // THEN
        Assertions.assertTrue(password.chars()
                        .mapToObj(c -> (char) c)
                        .anyMatch(ch -> specialCharacters.contains(String.valueOf(ch))),
                "Password should contain at least one special character");
    }
}
