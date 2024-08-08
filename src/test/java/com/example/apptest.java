package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class apptest {

    @Test
    public void testAdd() {
        app app = new app();
        int result = app.add(2, 3);
        assertEquals(5, result);
    }
}
