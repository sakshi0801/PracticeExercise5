/**
 * Created by Sakshi
 * date- 17/05/19
 * This program find number of count in input string and output is a Map<String,Integer>
 */

package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCount {

    //find count of elements in the string
    public int counter(String input,String search) {
        int count=0;
        Pattern p=Pattern.compile(search);
        Matcher m=p.matcher(input);
        while (m.find()) {
            count++;
        }
        return count;
    }

    //return map containing string and its count
    public Map<String,Integer> fCount(String input) {
        if(input==null) {
            return null;
        }
        else {
            String[] searchArr={"one","two","three"};
            Map<String,Integer> output=new HashMap<>();

            for(int i=0;i<searchArr.length;i++) {
                output.put(searchArr[i],counter(input,searchArr[i]));
            }
            return output;
        }
    }
}
