package edu.gmu.cs321;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ImmigrantTest {
    @Test
    public void testcheckAnum() {
        Immigrant testImm = new Immigrant();
        boolean testRest = testImm.checkANum("1");
        assertTrue( testRest );    
    }
}
