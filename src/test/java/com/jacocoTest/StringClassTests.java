package com.jacocoTest;

import com.jacoco.StringClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringClassTests {
    @Test
    public void testNullInput(){
        StringClass s = new StringClass();
        assertThrows(IllegalArgumentException.class ,() ->{
            s.getStringValue(null);
        });
    }
    @Test
    public void isEmptyTest() {
        StringClass s = new StringClass();
        Assertions.assertEquals("Empty String", s.getStringValue(""));
    }

    @Test
    void whitespaceTest() {
        StringClass w = new StringClass();
        Assertions.assertEquals("WhiteSpace",w.getStringValue("   "));
    }

    @Test
    void toUpperTest() {
        StringClass upper = new StringClass();
        Assertions.assertTrue(true,upper.getStringValue("MANHA"));
    }
}
