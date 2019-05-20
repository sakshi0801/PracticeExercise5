/**
 * Created by Sakshi
 * date- 17/05/19
 * This program test the count of particular string in input string.
 */

package Programs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindCountTest {

    private static FindCount fc;

    @BeforeClass
    public static void setup()
    {
        fc=new FindCount();
    }

    @AfterClass
    public static void teardown()
    {
        fc=null;
    }

    //Test scenario 1: given an input string returns the count of particular string in input
    @Test
    public void fCount_GivenInputString_ReturnsCountOfElements() {
        String input="one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectResult=new HashMap<>();
        expectResult.put("one",5);
        expectResult.put("two",2);
        expectResult.put("three",2);
        assertEquals(expectResult,fc.fCount(input));
    }

    //Test scenario 2: failure for test scenario 1
    @Test
    public void fCount_GivenInputString_ReturnsCountOfElementsFailure() {
        String input="one one -one___two,,three,one @three*one?two";
        Map<String, Integer> expectResult=new HashMap<>();
        expectResult.put("one",4);
        expectResult.put("two",1);
        expectResult.put("three",2);
        assertNotEquals(expectResult,fc.fCount(input));
    }

    //Test scenario 3: null input string returns a null output
    @Test
    public void fCount_GivenNullInput_ReturnsNull() {
        String input=null;
        assertEquals(null,fc.fCount(input));
    }

    //Test scenario 4: failure for test scenario 3
    @Test
    public void fCount_GivenNullInput_ReturnsNullFailure() {
        String input=null;
        Map<String,Integer> expectOutput=new HashMap<>();
        expectOutput.put("",1);
        assertNotEquals(expectOutput,fc.fCount(input));
    }
}