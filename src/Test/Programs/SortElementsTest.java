/**
 * Created by Sakshi
 * date- 17/05/19
 * This program is used to test sorting of set elements
 */

package Programs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortElementsTest {

    @BeforeClass
    public static void setup()
    {
        se=new SortElements();
    }

    @AfterClass
    public static void teardown()
    {
        se=null;
    }

    private static SortElements se;

    //Test scenario 1: Returns an ordered set of names
    @Test
    public void sortElements_GivenStringArray_ReturnSortedElements() {
        String[] input={"Harry","Olive","Alice","Bluto","Eugene"};
        Set<String> output=new TreeSet<>();
        output.add("Alice");
        output.add("Bluto");
        output.add("Eugene");
        output.add("Harry");
        output.add("Olive");

        List<String> output1=new ArrayList<>();
        output1.addAll(output);

        assertEquals(output,se.sortSetElements(input));
        assertEquals(output1,se.setToArrayList(se.sortSetElements(input)));
    }

    //Test scenario 2: Failure for test scenario 1
    @Test
    public void sortElements_GivenStringArray_ReturnSortedElementsFailure() {
        String[] input={"Harry","Olive","Alice","Bluto","Eugene"};
        Set<String> output=new HashSet<>();
        output.add("Harry");
        output.add("Alice");
        output.add("Bluto");
        output.add("Eugene");
        List<String> output1=new ArrayList<>();
        output1.addAll(output);

        assertNotEquals(output,se.sortSetElements(input));
        assertNotEquals(output1,se.setToArrayList(se.sortSetElements(input)));
    }
}