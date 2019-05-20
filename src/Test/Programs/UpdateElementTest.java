/**
 * Created by Sakshi
 * date- 17/05/19
 * This program test if specific array element is updated by given element and empty the array list.
 */
package Programs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateElementTest {

    @BeforeClass
    public static void setup() {
        updateElement=new UpdateElement();
    }

    @AfterClass
    public static void teardown() {
        updateElement=null;
    }

    private static UpdateElement updateElement;

    //Test Scenario 1: Update specific element in the array list and return list
    @Test
    public void updateValues_GivenInputList_ReturnUpdatedValues() {
        List<String> input=new ArrayList<String>();
        List<String> output=new ArrayList<String>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        int index=0;
        String value="Kiwi";

        output.add("Kiwi");
        output.add("Grape");
        output.add("Melon");
        output.add("Berry");
        assertEquals(output,updateElement.updateValues(input,index,value));

        assertEquals(true,updateElement.clearListValues(output).isEmpty());
    }

    //Test Scenario 2: Failure for test scenario 1
    @Test
    public void updateValues_GivenInputList_ReturnUpdatedValuesFailure() {
        List<String> input=new ArrayList<String>();
        List<String> output=new ArrayList<String>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");

        int index=0;
        String value="Kiwi";

        output.add("Kiwi");
        output.add("Grape");
        output.add("Mango");
        output.add("Berry");
        assertNotEquals(output,updateElement.updateValues(input,index,value));
    }
}