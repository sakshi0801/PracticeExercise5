/**
 * Created by Sakshi
 * date- 17/05/19
 * This program is used to test map object containing different strings as input
 */

package Programs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountStringTest {

    private static CountString cs;

    @BeforeClass
    public static void setup()
    {
        cs=new CountString();
    }

    @AfterClass
    public static void teardown()
    {
        cs=null;
    }

    //Test scenario 1: Given a string array return Map<String,Boolean> where value is true if key appears more than 2 times
    @Test
    public void findCountOfElemenets_GivenInputString_ReturnMap() {
        String[] input={"a","b","c","d","a","c","c"};
        Map<String,Boolean> output=new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",false);

        assertEquals(output,cs.findCountOfElements(input));
    }

    //Test scenario 2: Failure for test scenario 1
    @Test
    public void findCountOfElemenets_GivenInputString_ReturnMapFailure() {
        String[] input={"a","b","c","d","a","c","c"};
        Map<String,Boolean> output=new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",true);

        assertNotEquals(output,cs.findCountOfElements(input));
    }

    //Test scenario 3: Given a string array with any one element as null returns a map with key and value
    @Test
    public void findCountOfElemenets_InputNullValue_ReturnsMap() {
        String[] input={"a","b","c","d","a","c","c",null};
        Map<String,Boolean> output=new HashMap<>();
        output.put("a",true);
        output.put("b",false);
        output.put("c",true);
        output.put("d",true);
        assertNotEquals(output,cs.findCountOfElements(input));
    }

    //Test Scenario 4: Given a null string array returns null
    @Test
    public void findCountOfElemenets_InputNullString_ReturnsNull()
    {
        assertEquals(null,cs.findCountOfElements(null));
    }
}