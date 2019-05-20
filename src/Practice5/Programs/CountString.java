/**
 * Created by Sakshi
 * date- 17/05/19
 * This program takes an array of strings as input and output is a Map<String,boolean> where
 * each different string is a key and its value is true if that string appears two or more times in the array
 */

package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountString {

    //check if the string appears more than two times and return true or false accordingly
    public boolean counterValue(String input,String search) {
        int count=0;
        Pattern p=Pattern.compile(search);
        Matcher m=p.matcher(input);
        while (m.find()) {
            count++;
        }
        if(count>=2) {
            return true;
        }
        else {
            return false;
        }
    }

    //returns map with key as value
    public Map<String,Boolean> findCountOfElements(String[] input) {
        //if input is null return null
        if(input==null) {
            return null;
        }
        Map<String,Boolean> output=new HashMap<>();

        //put different strings in map with default value as false
        for (int i=0;i<input.length;i++) {
            if(input[i]==null) {
                continue;
            }
            else {
                output.put(input[i],false);
            }
        }

        String temp="";
        for(int i=0;i<input.length;i++) {
            temp+=input[i]+" ";
        }

        Iterator<Map.Entry<String,Boolean>> it=output.entrySet().iterator();

        //for every entry in map perform operation
        while (it.hasNext()) {
            Map.Entry<String,Boolean> value=it.next();
            String key=value.getKey();
            //set value for every key
            output.put(key,counterValue(temp,key));
        }
        return output;
    }
}
