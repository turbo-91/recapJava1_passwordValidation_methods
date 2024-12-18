package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class passwordValidationTest {

// Tests for pwLength_min8

    @Test
    void abcdefghj_shouldReturnTrue(){
        // GIVEN
        String password = "abcdefghj";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void abcdefgh_shouldReturnTrue(){
        // GIVEN
        String password = "abcdefgh";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void abc_shouldReturnFalse(){
        // GIVEN
        String password = "abc";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }


    @Test
    void eightSymbols_shouldReturnTrue(){
        // GIVEN
        String password = "!§\"&$(?!";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void sevenSymbols_shouldReturnFalse(){
        // GIVEN
        String password = "§\"&$(?!";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void eightSpaces_shouldReturnTrue(){
        // GIVEN
        String password = "        ";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void sevenSpaces_shouldReturnFalse(){
        // GIVEN
        String password = "       ";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void empty_shouldReturnFalse(){
        // GIVEN
        String password = "";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    };


    @Test
    void nullLength_shouldReturnFalse(){
        // GIVEN
        String password = null;
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    };


// Tests for pwContains_digits

    @Test
    void one_shouldReturnTrue(){
        // GIVEN
        String password = "1";
        // WHE
        Boolean actual = passwordValidation.pwContains_digits(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    };

    @Test
    void a_shouldReturnFalse(){
        // GIVEN
        String password = "a";
        // WHE
        Boolean actual = passwordValidation.pwContains_digits(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void symbolsDigits_shouldReturnTrue(){
        // GIVEN
        String password = "!@#123";
        // WHE
        Boolean actual = passwordValidation.pwContains_digits(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    };


    @Test
    void symbols_shouldReturnFalse(){
        // GIVEN
        String password = "!@#(";
        // WHE
        Boolean actual = passwordValidation.pwContains_digits(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    };

    @Test
    void nullDigits_shouldReturnFalse(){
        // GIVEN
        String password = null;
        // WHE
        Boolean actual = passwordValidation.pwContains_digits(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    };


    @Test
    void spaceDigits_shouldReturnTrue(){
        // GIVEN
        String password = " 123";
        // WHE
        Boolean actual = passwordValidation.pwContains_digits(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    };

// Tests for pwContains_lowerCaseUpperCase


    @Test
    void Torben_shouldReturnTrue(){
        // GIVEN
        String password = "Torben";
        // WHE
        Boolean actual = passwordValidation.pwContains_LowerCaseUpperCase(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void torben_shouldReturnFalse(){
        // GIVEN
        String password = "torben";
        // WHE
        Boolean actual = passwordValidation.pwContains_LowerCaseUpperCase(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void TORBEN_shouldReturnFalse(){
        // GIVEN
        String password = "TORBEN";
        // WHE
        Boolean actual = passwordValidation.pwContains_LowerCaseUpperCase(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void t_shouldReturnFalse(){
        // GIVEN
        String password = "t";
        // WHE
        Boolean actual = passwordValidation.pwContains_LowerCaseUpperCase(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void T_shouldReturnFalse(){
        // GIVEN
        String password = "T";
        // WHE
        Boolean actual = passwordValidation.pwContains_LowerCaseUpperCase(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void symbolsOnly_shouldReturnFalse(){
        // GIVEN
        String password = "/(!$)§!§/&";
        // WHE
        Boolean actual = passwordValidation.pwContains_LowerCaseUpperCase(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nullUpperLower_shouldReturnFalse(){
        // GIVEN
        String password = null;
        // WHE
        Boolean actual = passwordValidation.pwContains_LowerCaseUpperCase(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }


    // Tests for pwIs_commonlyUsed

    @Test
    void safePassword_shouldReturnFalse(){
        // GIVEN
        String password = "&%gOdDeSs91!";
        // WHE
        Boolean actual = passwordValidation.pwIs_commonlyUsed(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void weakPasswordDigits_shouldReturnTrue(){
        // GIVEN
        String password = "666666";
        // WHE
        Boolean actual = passwordValidation.pwIs_commonlyUsed(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void weakPasswordMix_shouldReturnTrue(){
        // GIVEN
        String password = "Passw0rd";
        // WHE
        Boolean actual = passwordValidation.pwIs_commonlyUsed(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void weakPasswordUppercase_shouldReturnTrue(){
        // GIVEN
        String password = "PASSWORD";
        // WHE
        Boolean actual = passwordValidation.pwIs_commonlyUsed(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nullCommonlyUsed_shouldReturnTrue(){
        // GIVEN
        String password = null;
        // WHE
        Boolean actual = passwordValidation.pwIs_commonlyUsed(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

// tests for pwContains_specialCharacters

    @Test
    void semicolon_shouldReturnTrue(){
        // GIVEN
        String password = ";";
        // WHE
        Boolean actual = passwordValidation.pwContains_specialCharacters(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void specialCharacters_shouldReturnTrue(){
        // GIVEN
        String password = "!§=)(=)$/%";
        // WHE
        Boolean actual = passwordValidation.pwContains_specialCharacters(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numbers_shouldReturnFalse(){
        // GIVEN
        String password = "torben666";
        // WHE
        Boolean actual = passwordValidation.pwContains_specialCharacters(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void space_shouldReturnFalse(){
        // GIVEN
        String password = "torben jost";
        // WHE
        Boolean actual = passwordValidation.pwContains_specialCharacters(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }



}
