package com.joshdavham;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MySpecialClassTest {

    @Test
    public void testMakeSparkly() {
        String result = MySpecialClass.makeSparkly("Hello");
        assertTrue(result.contains("Hello"));
        assertTrue(result.equals("⭐⭐⭐Hello⭐⭐⭐"));
    }
}
