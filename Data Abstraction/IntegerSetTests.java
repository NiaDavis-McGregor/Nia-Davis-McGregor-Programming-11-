import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSetTests {
    IntegerSet testSet;

    @Before
    public void setup() {
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertAlreadyThere() {
        //adds number to set
        testSet.insert(5);

        //checks number is in the set
        assertEquals(testSet.size(), 1);
        assertTrue(testSet.contains(5));

        //tries adding same number again
        testSet.insert(5);
        assertEquals(testSet.size(), 1);
    }
}
