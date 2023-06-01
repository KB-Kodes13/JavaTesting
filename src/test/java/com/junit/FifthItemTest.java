package com.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class FifthItemTest {
    @Test
    public void testGetFifthItem() {
        FifthItem fifthItem = new FifthItem();
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Blueberry");
        myList.add("Orange");
        myList.add("Strawberry");
        myList.add("Watermelon");
        myList.add("Mango");
        myList.add("Lemon");

        String actual = fifthItem.getFifthItem(myList);
        String expected = "Mango";
        assertEquals(expected, actual);
    }

}
