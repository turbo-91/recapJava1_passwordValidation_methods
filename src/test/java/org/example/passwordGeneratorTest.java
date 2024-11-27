package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordGeneratorTest {

@Test
    void torbenJ_shouldReturnPassword() {
    // GIVEN
    String username = "torbenJ";
    // WHE
    String actual = passwordGenerator.generatePassword(username);
    // THEN
    String expected = "";
    Assertions.assertEquals(expected, actual);
}

}