package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.Main.HouseCat;
import static org.junit.Assert.assertEquals;

public class HouseCatTest {
    HouseCat test_houseCat;

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }


}
