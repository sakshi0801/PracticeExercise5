/**
 * Created by Sakshi
 * date- 17/05/19
 * This program implements set interface which sorts the given randomly ordered names in
 * ascending order.
 */
package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortElements {

    //return sorted set of elements
    public Set<String> sortSetElements(String[] input)
    {
        Set<String> values=new TreeSet<>();
        for (int i=0;i<input.length;i++)
        {
            values.add(input[i]);
        }
        return values;
    }

    //put set elements in an array list
    public List<String> setToArrayList(Set<String> input)
    {
        List<String> output=new ArrayList<>();
        output.addAll(input);
        return output;
    }
}
