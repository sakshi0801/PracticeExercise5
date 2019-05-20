/**
 * Created by Sakshi
 * date- 17/05/19
 * This program to test if the map values are interchanged appropriately
 */

package Programs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapOperationTest {

    private static MapOperation mapOperation;

    @BeforeClass
    public static void setup()
    {
        mapOperation=new MapOperation();
    }

    @AfterClass
    public static void teardown()
    {
        mapOperation=null;
    }

    //Test scenario 1: Given two key-value pairs in map. set value of key 'Val1' into
    // key 'Val2' and set value of key 'Val1' to empty
    @Test
    public void changeValue_GivenTwoValues_ReturnChangedValue() {
        Map<String,String> input=new HashMap<>();
        input.put("Val2","Hello");
        input.put("Val1","Hi");

        Map<String,String> expectOutput=new HashMap<>();
        expectOutput.put("Val2","Hi");
        expectOutput.put("Val1"," ");

        assertEquals(expectOutput,mapOperation.changeValue(input));
    }

    //Test scenario 2: Failure for test scenario 1
    @Test
    public void changeValue_GivenTwoValues_ReturnChangedValueFailure() {
        Map<String,String> input=new HashMap<>();
        input.put("Val1","Hi");
        input.put("Val2","Hello");

        Map<String,String> expectOutput=new HashMap<>();
        expectOutput.put("Val1","Hello");
        expectOutput.put("Val2","Hi");

        assertNotEquals(expectOutput,mapOperation.changeValue(input));
    }

    //Test scenario 3: Returns null if no 'Val1' is given as input key in map
    @Test
    public void changeValue_GivenMissingValOneInput_ReturnNull() {
        Map<String,String> input=new HashMap<>();
        input.put("Val2","Hello");
        input.put("Val3","Hi");

        assertEquals(null,mapOperation.changeValue(input));
    }

    //Test scenario 4: Failure for test scenario 3
    @Test
    public void changeValue_GivenMissingValOneInput_ReturnNullFailure() {
        Map<String,String> input=new HashMap<>();
        input.put("Val2","Hello");
        input.put("Val3","Hi");

        Map<String,String> expectOutput=new HashMap<>();
        expectOutput.put("Val2","Hi");
        expectOutput.put("Val1"," ");

        assertNotEquals(expectOutput,mapOperation.changeValue(input));
    }
}