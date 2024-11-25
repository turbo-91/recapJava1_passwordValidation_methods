package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidationTest {

//    @BeforeEach
//        // -> Wird vor jedem Test ausgeführt
//    void resetAllXY() {
//        //Setze x & y wieder auf 0. Das macht jeden Test wieder erwartbar, da immer von x&y=0 ausgegangen wird.
//        PlayerCharacter.x =0;
//        PlayerCharacter.y =0;
//    }

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
            String password = "abc";
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
    void spaceDigits_shouldReturnTrue(){
        // GIVEN
        String password = " 123";
        // WHE
        Boolean actual = passwordValidation.pwContains_digits(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    };



// Test: password empty
    // Test: password null


}