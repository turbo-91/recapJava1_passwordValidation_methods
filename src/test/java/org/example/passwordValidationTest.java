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
    void abc_shouldReturnTrue(){
        // GIVEN
        String password = "abc";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void signs_shouldReturnTrue(){
        // GIVEN
        String password = "abcd§\"&$( efgh !";
        // WHE
        Boolean actual = passwordValidation.pwLength_min8(password);
        // THEN
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }



    // password always to string (can contain ints etc?)

}