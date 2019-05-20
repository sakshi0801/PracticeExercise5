/**
 * Created by Sakshi
 * date- 17/05/19
 * This program updates specific array element by given element and empty the array list.
 */
package Programs;

import java.util.List;

public class UpdateElement {

    //update array element and return list
    public List<String> updateValues(List<String> input,int index,String value) {
        input.set(index,value);
        return input;
    }

    //clear list values
    public List<String> clearListValues(List<String> input) {
        input.clear();
        return input;
    }
}
