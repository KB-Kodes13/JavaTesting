package com.junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HiFriendTest {
    @DisplayName("Test hiFriend() method")
    @Test
    void testHiFriend() {
        assertEquals("Hi Kobe Bryant!", HiFriend.hiFriend("Kobe Bryant"));
    }
}
