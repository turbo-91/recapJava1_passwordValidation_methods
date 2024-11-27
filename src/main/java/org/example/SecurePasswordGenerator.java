package org.example;

import java.util.Random;

public class SecurePasswordGenerator {

    public static String generateSecurePassword() {
        Random random = new Random();

        // Define characters for password generation
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{};:'\",.<>?/|\\~`";

        // Password length minimum is 8, ensuring variety
        int minLength = 12; // Longer than 8 for extra security
        int maxLength = 16;

        // Generate password length within the range
        int passwordLength = minLength + random.nextInt(maxLength - minLength + 1);

        // Build the password ensuring it meets all criteria
        StringBuilder password = new StringBuilder();

        // Ensure at least one character from each category is present
        password.append(uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length())));
        password.append(lowercaseLetters.charAt(random.nextInt(lowercaseLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        // Fill the remaining password with a mix of all character categories
        String allCharacters = uppercaseLetters + lowercaseLetters + digits + specialCharacters;
        for (int i = 4; i < passwordLength; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the password to avoid predictable patterns
        return shufflePassword(password.toString(), random);
    }

    // Method to shuffle the characters in the password
    private static String shufflePassword(String password, Random random) {
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int randomIndex = random.nextInt(chars.length);
            // Swap characters
            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        // Generate and print a secure password
        String securePassword = generateSecurePassword();
        System.out.println("Generated Secure Password: " + securePassword);
    }
}
